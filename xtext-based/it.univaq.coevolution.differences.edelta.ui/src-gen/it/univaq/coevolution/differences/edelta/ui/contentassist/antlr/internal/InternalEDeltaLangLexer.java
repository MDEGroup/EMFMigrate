package it.univaq.coevolution.differences.edelta.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEDeltaLangLexer extends Lexer {
    public static final int T__42=42;
    public static final int T__40=40;
    public static final int RULE_ID=6;
    public static final int T__41=41;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_BOOL=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=7;
    public static final int T__16=16;
    public static final int T__33=33;
    public static final int T__15=15;
    public static final int T__34=34;
    public static final int T__18=18;
    public static final int T__35=35;
    public static final int T__17=17;
    public static final int T__36=36;
    public static final int T__12=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__14=14;
    public static final int T__39=39;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=10;

    // delegates
    // delegators

    public InternalEDeltaLangLexer() {;} 
    public InternalEDeltaLangLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalEDeltaLangLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:11:7: ( '*' )
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:11:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:12:7: ( 'package' )
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:12:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:13:7: ( '=' )
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:13:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:14:7: ( '{' )
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:14:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:15:7: ( '}' )
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:15:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:16:7: ( 'deletePackage' )
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:16:9: 'deletePackage'
            {
            match("deletePackage"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:17:7: ( '(' )
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:17:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:18:7: ( ')' )
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:18:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:19:7: ( 'addPackage' )
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:19:9: 'addPackage'
            {
            match("addPackage"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:20:7: ( 'changePackage' )
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:20:9: 'changePackage'
            {
            match("changePackage"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:21:7: ( 'class' )
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:21:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:22:7: ( 'set' )
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:22:9: 'set'
            {
            match("set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:23:7: ( ';' )
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:23:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:24:7: ( ',' )
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:24:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:25:7: ( 'attribute' )
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:25:9: 'attribute'
            {
            match("attribute"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:26:7: ( 'reference' )
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:26:9: 'reference'
            {
            match("reference"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:27:7: ( 'def change' )
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:27:9: 'def change'
            {
            match("def change"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:28:7: ( ':' )
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:28:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:29:7: ( 'bool' )
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:29:9: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:30:7: ( 'int' )
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:30:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:31:7: ( 'string' )
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:31:9: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:32:7: ( 'changeClass(' )
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:32:9: 'changeClass('
            {
            match("changeClass("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:33:7: ( 'addClass(' )
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:33:9: 'addClass('
            {
            match("addClass("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:34:7: ( 'deleteClass(' )
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:34:9: 'deleteClass('
            {
            match("deleteClass("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:35:7: ( '<=' )
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:35:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:36:7: ( 'changeAttribute(' )
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:36:9: 'changeAttribute('
            {
            match("changeAttribute("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:37:7: ( 'addAttribute(' )
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:37:9: 'addAttribute('
            {
            match("addAttribute("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:38:7: ( 'deleteAttribute(' )
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:38:9: 'deleteAttribute('
            {
            match("deleteAttribute("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:39:7: ( 'changeReference' )
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:39:9: 'changeReference'
            {
            match("changeReference"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:40:7: ( 'addReference' )
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:40:9: 'addReference'
            {
            match("addReference"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:41:7: ( 'deleteReference' )
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:41:9: 'deleteReference'
            {
            match("deleteReference"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "RULE_BOOL"
    public final void mRULE_BOOL() throws RecognitionException {
        try {
            int _type = RULE_BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7263:11: ( ( 'true' | 'false' ) )
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7263:13: ( 'true' | 'false' )
            {
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7263:13: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7263:14: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7263:21: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7265:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7265:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7265:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7265:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7265:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7267:10: ( ( '0' .. '9' )+ )
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7267:12: ( '0' .. '9' )+
            {
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7267:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7267:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7269:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7269:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7269:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7269:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7269:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7269:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7269:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7269:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7269:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7269:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7269:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7271:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7271:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7271:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7271:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7273:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7273:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7273:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7273:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7273:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7273:41: ( '\\r' )? '\\n'
                    {
                    // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7273:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7273:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7275:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7275:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7275:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7277:16: ( . )
            // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:7277:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | RULE_BOOL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=39;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:1:196: RULE_BOOL
                {
                mRULE_BOOL(); 

                }
                break;
            case 33 :
                // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:1:206: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 34 :
                // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:1:214: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 35 :
                // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:1:223: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 36 :
                // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:1:235: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 37 :
                // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:1:251: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 38 :
                // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:1:267: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 39 :
                // ../it.univaq.coevolution.differences.edelta.ui/src-gen/it/univaq/coevolution/differences/edelta/ui/contentassist/antlr/internal/InternalEDeltaLang.g:1:275: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\2\uffff\1\37\3\uffff\1\37\2\uffff\3\37\2\uffff\1\37\1\uffff\2\37"+
        "\1\34\2\37\1\34\2\uffff\3\34\3\uffff\1\37\4\uffff\1\37\2\uffff\6"+
        "\37\2\uffff\1\37\1\uffff\2\37\1\uffff\2\37\5\uffff\7\37\1\122\3"+
        "\37\1\126\4\37\1\uffff\7\37\1\uffff\2\37\1\144\1\uffff\1\145\11"+
        "\37\1\157\2\37\2\uffff\1\145\10\37\1\uffff\1\u0080\1\37\1\u0082"+
        "\15\37\1\uffff\1\37\1\uffff\23\37\1\uffff\2\37\1\u00a6\4\37\1\u00ab"+
        "\4\37\1\u00b0\2\37\1\uffff\4\37\1\uffff\4\37\1\uffff\7\37\1\uffff"+
        "\3\37\1\u00c5\1\37\1\uffff\2\37\1\u00c9\2\37\2\uffff\1\u00cc\2\37"+
        "\1\uffff\2\37\1\uffff\3\37\1\u00d4\1\37\1\u00d6\4\uffff";
    static final String DFA13_eofS =
        "\u00d7\uffff";
    static final String DFA13_minS =
        "\1\0\1\uffff\1\141\3\uffff\1\145\2\uffff\1\144\1\150\1\145\2\uffff"+
        "\1\145\1\uffff\1\157\1\156\1\75\1\162\1\141\1\101\2\uffff\2\0\1"+
        "\52\3\uffff\1\143\4\uffff\1\146\2\uffff\1\144\1\164\2\141\1\164"+
        "\1\162\2\uffff\1\146\1\uffff\1\157\1\164\1\uffff\1\165\1\154\5\uffff"+
        "\1\153\1\145\1\40\1\101\1\162\1\156\1\163\1\60\1\151\1\145\1\154"+
        "\1\60\1\145\1\163\1\141\1\164\1\uffff\1\141\1\154\1\164\1\145\1"+
        "\151\1\147\1\163\1\uffff\1\156\1\162\1\60\1\uffff\1\60\1\145\1\147"+
        "\1\145\1\143\1\141\1\164\1\146\1\142\1\145\1\60\1\147\1\145\2\uffff"+
        "\1\60\1\145\1\101\1\153\1\163\1\162\1\145\1\165\1\101\1\uffff\1"+
        "\60\1\156\1\60\1\141\1\154\1\164\1\145\1\141\1\163\1\151\1\162\1"+
        "\164\1\141\1\154\1\164\1\145\1\uffff\1\143\1\uffff\1\143\1\141\1"+
        "\164\1\146\1\147\1\50\1\142\2\145\1\143\1\141\1\164\1\146\1\145"+
        "\1\153\1\163\1\162\2\145\1\uffff\1\165\1\156\1\60\1\153\1\163\1"+
        "\162\1\145\1\60\1\141\1\163\1\151\1\162\1\60\1\164\1\143\1\uffff"+
        "\1\141\1\163\1\151\1\162\1\uffff\1\147\1\50\1\142\1\145\1\uffff"+
        "\2\145\1\147\1\50\1\142\2\145\1\uffff\1\165\1\156\1\50\1\60\1\145"+
        "\1\uffff\1\165\1\156\1\60\1\164\1\143\2\uffff\1\60\1\164\1\143\1"+
        "\uffff\2\145\1\uffff\2\145\1\50\1\60\1\50\1\60\4\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\uffff\1\141\3\uffff\1\145\2\uffff\1\164\1\154\1\164\2"+
        "\uffff\1\145\1\uffff\1\157\1\156\1\75\1\162\1\141\1\172\2\uffff"+
        "\2\uffff\1\57\3\uffff\1\143\4\uffff\1\154\2\uffff\1\144\1\164\2"+
        "\141\1\164\1\162\2\uffff\1\146\1\uffff\1\157\1\164\1\uffff\1\165"+
        "\1\154\5\uffff\1\153\1\145\1\40\1\122\1\162\1\156\1\163\1\172\1"+
        "\151\1\145\1\154\1\172\1\145\1\163\1\141\1\164\1\uffff\1\141\1\154"+
        "\1\164\1\145\1\151\1\147\1\163\1\uffff\1\156\1\162\1\172\1\uffff"+
        "\1\172\1\145\1\147\1\145\1\143\1\141\1\164\1\146\1\142\1\145\1\172"+
        "\1\147\1\145\2\uffff\1\172\1\145\1\122\1\153\1\163\1\162\1\145\1"+
        "\165\1\122\1\uffff\1\172\1\156\1\172\1\141\1\154\1\164\1\145\1\141"+
        "\1\163\1\151\1\162\1\164\1\141\1\154\1\164\1\145\1\uffff\1\143\1"+
        "\uffff\1\143\1\141\1\164\1\146\1\147\1\50\1\142\2\145\1\143\1\141"+
        "\1\164\1\146\1\145\1\153\1\163\1\162\2\145\1\uffff\1\165\1\156\1"+
        "\172\1\153\1\163\1\162\1\145\1\172\1\141\1\163\1\151\1\162\1\172"+
        "\1\164\1\143\1\uffff\1\141\1\163\1\151\1\162\1\uffff\1\147\1\50"+
        "\1\142\1\145\1\uffff\2\145\1\147\1\50\1\142\2\145\1\uffff\1\165"+
        "\1\156\1\50\1\172\1\145\1\uffff\1\165\1\156\1\172\1\164\1\143\2"+
        "\uffff\1\172\1\164\1\143\1\uffff\2\145\1\uffff\2\145\1\50\1\172"+
        "\1\50\1\172\4\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\uffff\1\7\1\10\3\uffff\1\15\1"+
        "\16\1\uffff\1\22\6\uffff\1\41\1\42\3\uffff\1\46\1\47\1\1\1\uffff"+
        "\1\41\1\3\1\4\1\5\1\uffff\1\7\1\10\6\uffff\1\15\1\16\1\uffff\1\22"+
        "\2\uffff\1\31\2\uffff\1\42\1\43\1\44\1\45\1\46\20\uffff\1\21\7\uffff"+
        "\1\14\3\uffff\1\24\15\uffff\1\23\1\40\11\uffff\1\13\20\uffff\1\25"+
        "\1\uffff\1\2\23\uffff\1\27\17\uffff\1\17\4\uffff\1\20\4\uffff\1"+
        "\11\7\uffff\1\30\5\uffff\1\26\5\uffff\1\33\1\36\3\uffff\1\6\2\uffff"+
        "\1\12\6\uffff\1\34\1\37\1\32\1\35";
    static final String DFA13_specialS =
        "\1\2\27\uffff\1\0\1\1\u00bd\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\34\2\33\2\34\1\33\22\34\1\33\1\34\1\30\4\34\1\31\1\7\1\10"+
            "\1\1\1\34\1\15\2\34\1\32\12\27\1\17\1\14\1\22\1\3\3\34\32\26"+
            "\3\34\1\25\1\26\1\34\1\11\1\20\1\12\1\6\1\26\1\24\2\26\1\21"+
            "\6\26\1\2\1\26\1\16\1\13\1\23\6\26\1\4\1\34\1\5\uff82\34",
            "",
            "\1\36",
            "",
            "",
            "",
            "\1\43",
            "",
            "",
            "\1\46\17\uffff\1\47",
            "\1\50\3\uffff\1\51",
            "\1\52\16\uffff\1\53",
            "",
            "",
            "\1\56",
            "",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\0\66",
            "\0\66",
            "\1\67\4\uffff\1\70",
            "",
            "",
            "",
            "\1\72",
            "",
            "",
            "",
            "",
            "\1\74\5\uffff\1\73",
            "",
            "",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "",
            "",
            "\1\103",
            "",
            "\1\104",
            "\1\105",
            "",
            "\1\106",
            "\1\107",
            "",
            "",
            "",
            "",
            "",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\115\1\uffff\1\114\14\uffff\1\113\1\uffff\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\123",
            "\1\124",
            "\1\125",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "",
            "\1\142",
            "\1\143",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\160",
            "\1\161",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\162",
            "\1\165\1\uffff\1\164\14\uffff\1\163\1\uffff\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\176\1\uffff\1\175\14\uffff\1\174\1\uffff\1\177",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0081",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "",
            "\1\u0090",
            "",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "",
            "\1\u00a4",
            "\1\u00a5",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00b1",
            "\1\u00b2",
            "",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00c6",
            "",
            "\1\u00c7",
            "\1\u00c8",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00ca",
            "\1\u00cb",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00cd",
            "\1\u00ce",
            "",
            "\1\u00cf",
            "\1\u00d0",
            "",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00d5",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | RULE_BOOL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_24 = input.LA(1);

                        s = -1;
                        if ( ((LA13_24>='\u0000' && LA13_24<='\uFFFF')) ) {s = 54;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_25 = input.LA(1);

                        s = -1;
                        if ( ((LA13_25>='\u0000' && LA13_25<='\uFFFF')) ) {s = 54;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='*') ) {s = 1;}

                        else if ( (LA13_0=='p') ) {s = 2;}

                        else if ( (LA13_0=='=') ) {s = 3;}

                        else if ( (LA13_0=='{') ) {s = 4;}

                        else if ( (LA13_0=='}') ) {s = 5;}

                        else if ( (LA13_0=='d') ) {s = 6;}

                        else if ( (LA13_0=='(') ) {s = 7;}

                        else if ( (LA13_0==')') ) {s = 8;}

                        else if ( (LA13_0=='a') ) {s = 9;}

                        else if ( (LA13_0=='c') ) {s = 10;}

                        else if ( (LA13_0=='s') ) {s = 11;}

                        else if ( (LA13_0==';') ) {s = 12;}

                        else if ( (LA13_0==',') ) {s = 13;}

                        else if ( (LA13_0=='r') ) {s = 14;}

                        else if ( (LA13_0==':') ) {s = 15;}

                        else if ( (LA13_0=='b') ) {s = 16;}

                        else if ( (LA13_0=='i') ) {s = 17;}

                        else if ( (LA13_0=='<') ) {s = 18;}

                        else if ( (LA13_0=='t') ) {s = 19;}

                        else if ( (LA13_0=='f') ) {s = 20;}

                        else if ( (LA13_0=='^') ) {s = 21;}

                        else if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='e'||(LA13_0>='g' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='o')||LA13_0=='q'||(LA13_0>='u' && LA13_0<='z')) ) {s = 22;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 23;}

                        else if ( (LA13_0=='\"') ) {s = 24;}

                        else if ( (LA13_0=='\'') ) {s = 25;}

                        else if ( (LA13_0=='/') ) {s = 26;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 27;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||LA13_0=='+'||(LA13_0>='-' && LA13_0<='.')||(LA13_0>='>' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}