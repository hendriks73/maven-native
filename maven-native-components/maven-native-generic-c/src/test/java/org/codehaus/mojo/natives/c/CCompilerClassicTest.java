package org.codehaus.mojo.natives.c;

import java.io.File;

import org.codehaus.mojo.natives.compiler.CompilerConfiguration;
import org.codehaus.plexus.PlexusTestCase;
import org.codehaus.plexus.util.cli.Commandline;

/**
 * 
 * @author dtran
 *
 */
public class CCompilerClassicTest
    extends PlexusTestCase
{

    /**
     * Simple test, note: -o option has no space
     * @throws Exception
     */
    public void testSimpleCompilation()
        throws Exception
    {
        CompilerConfiguration config = new CompilerConfiguration();
        CCompilerClassic compiler = new CCompilerClassic();
        Commandline cl = compiler.getCommandLine( new File( "source.c" ), new File( "object.o" ), config );
        assertTrue( cl.toString().contains( "gcc -oobject.o -c source.c" ));
    }
}
