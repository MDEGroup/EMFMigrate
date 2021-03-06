/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp;

public class EdeltaBuilderAdapter extends org.eclipse.core.resources.IncrementalProjectBuilder {
	
	/**
	 * the ID of the default, generated builder
	 */
	public final static String BUILDER_ID = "it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.builder";
	
	private it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaBuilder builder = new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaBuilder();
	
	public org.eclipse.core.resources.IProject[] build(int kind, @SuppressWarnings("rawtypes") java.util.Map args, final org.eclipse.core.runtime.IProgressMonitor monitor) throws org.eclipse.core.runtime.CoreException {
		return build(kind, args, monitor, builder, getProject());
	}
	
	public org.eclipse.core.resources.IProject[] build(int kind, java.util.Map<?,?> args, final org.eclipse.core.runtime.IProgressMonitor monitor, final it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaBuilder builder, org.eclipse.core.resources.IProject project) throws org.eclipse.core.runtime.CoreException {
		org.eclipse.core.resources.IResourceDelta delta = getDelta(project);
		if (delta == null) {
			return null;
		}
		delta.accept(new org.eclipse.core.resources.IResourceDeltaVisitor() {
			public boolean visit(org.eclipse.core.resources.IResourceDelta delta) throws org.eclipse.core.runtime.CoreException {
				if (delta.getKind() == org.eclipse.core.resources.IResourceDelta.REMOVED) {
					return false;
				}
				org.eclipse.core.resources.IResource resource = delta.getResource();
				if (resource instanceof org.eclipse.core.resources.IFile && resource.getName().endsWith("." + "edelta")) {
					org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createPlatformResourceURI(resource.getFullPath().toString(), true);
					if (builder.isBuildingNeeded(uri)) {
						it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaResource customResource = (it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaResource) new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl().getResource(uri, true);
						it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaMarkerHelper.unmark(customResource, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.EdeltaEProblemType.BUILDER_ERROR);
						builder.build(customResource, monitor);
					}
					return false;
				}
				return true;
			}
		});
		return null;
	}
	
}
