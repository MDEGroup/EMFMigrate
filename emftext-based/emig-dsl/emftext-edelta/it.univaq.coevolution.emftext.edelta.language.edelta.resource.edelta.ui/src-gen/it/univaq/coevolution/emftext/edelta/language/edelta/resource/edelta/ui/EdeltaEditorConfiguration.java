/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui;

/**
 * This class provides the configuration for the generated editor. It registers
 * content assistance and syntax highlighting.
 */
public class EdeltaEditorConfiguration extends org.eclipse.jface.text.source.SourceViewerConfiguration {
	
	private it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.EdeltaColorManager colorManager;
	private it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaResourceProvider resourceProvider;
	private it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.IEdeltaAnnotationModelProvider annotationModelProvider;
	private it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.IEdeltaBracketHandlerProvider bracketHandlerProvider;
	private it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.EdeltaQuickAssistAssistant quickAssistAssistant;
	
	/**
	 * Creates a new editor configuration.
	 * 
	 * @param resourceProvider the provider for the resource (usually this is the
	 * editor)
	 * @param colorManager the color manager to use
	 */
	public EdeltaEditorConfiguration(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaResourceProvider resourceProvider, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.IEdeltaAnnotationModelProvider annotationModelProvider, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.IEdeltaBracketHandlerProvider bracketHandlerProvider, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.EdeltaColorManager colorManager) {
		this.resourceProvider = resourceProvider;
		this.annotationModelProvider = annotationModelProvider;
		this.bracketHandlerProvider = bracketHandlerProvider;
		this.colorManager = colorManager;
	}
	
	public org.eclipse.jface.text.contentassist.IContentAssistant getContentAssistant(org.eclipse.jface.text.source.ISourceViewer sourceViewer) {
		
		org.eclipse.jface.text.contentassist.ContentAssistant assistant = new org.eclipse.jface.text.contentassist.ContentAssistant();
		assistant.setContentAssistProcessor(new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.EdeltaCompletionProcessor(resourceProvider, bracketHandlerProvider), org.eclipse.jface.text.IDocument.DEFAULT_CONTENT_TYPE);
		assistant.enableAutoActivation(true);
		assistant.setAutoActivationDelay(500);
		assistant.setProposalPopupOrientation(org.eclipse.jface.text.contentassist.IContentAssistant.PROPOSAL_OVERLAY);
		assistant.setContextInformationPopupOrientation(org.eclipse.jface.text.contentassist.IContentAssistant.CONTEXT_INFO_ABOVE);
		
		return assistant;
	}
	
	public String[] getConfiguredContentTypes(org.eclipse.jface.text.source.ISourceViewer sourceViewer) {
		return new String[] {
			org.eclipse.jface.text.IDocument.DEFAULT_CONTENT_TYPE,
		};
	}
	
	protected org.eclipse.jface.text.rules.ITokenScanner getScanner() {
		return new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.EdeltaTokenScanner(resourceProvider.getResource(), colorManager);
	}
	
	public org.eclipse.jface.text.presentation.IPresentationReconciler getPresentationReconciler(org.eclipse.jface.text.source.ISourceViewer sourceViewer) {
		
		org.eclipse.jface.text.presentation.PresentationReconciler reconciler = new org.eclipse.jface.text.presentation.PresentationReconciler();
		org.eclipse.jface.text.rules.DefaultDamagerRepairer repairer = new org.eclipse.jface.text.rules.DefaultDamagerRepairer(getScanner());
		reconciler.setDamager(repairer, org.eclipse.jface.text.IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(repairer, org.eclipse.jface.text.IDocument.DEFAULT_CONTENT_TYPE);
		
		return reconciler;
	}
	
	public org.eclipse.jface.text.source.IAnnotationHover getAnnotationHover(org.eclipse.jface.text.source.ISourceViewer sourceViewer) {
		return new org.eclipse.jface.text.source.DefaultAnnotationHover();
	}
	
	public org.eclipse.jface.text.ITextHover getTextHover(org.eclipse.jface.text.source.ISourceViewer sourceViewer, String contentType) {
		return new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.EdeltaTextHover(resourceProvider);
	}
	
	public org.eclipse.jface.text.hyperlink.IHyperlinkDetector[] getHyperlinkDetectors(org.eclipse.jface.text.source.ISourceViewer sourceViewer) {
		if (sourceViewer == null) {
			return null;
		}
		return new org.eclipse.jface.text.hyperlink.IHyperlinkDetector[] { new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.EdeltaHyperlinkDetector(resourceProvider.getResource()) };
	}
	
	public org.eclipse.jface.text.quickassist.IQuickAssistAssistant getQuickAssistAssistant(org.eclipse.jface.text.source.ISourceViewer sourceViewer) {
		if (quickAssistAssistant == null) {
			quickAssistAssistant = new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.EdeltaQuickAssistAssistant(resourceProvider, annotationModelProvider);
		}
		return quickAssistAssistant;
	}
	
}
