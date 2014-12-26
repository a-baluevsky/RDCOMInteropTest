//
// Auto-generated using JActiveX.EXE 5.00.2918
//   ("C:\Program Files\Microsoft Visual Studio\VJ98\jactivex.exe" /wfc  /w /xi /X:rkc /l "C:\DOCUME~1\a\LOCALS~1\Temp\jvcC0.tmp" /nologo /d "C:\Projects\JRefalDriver\RDCOMInteropTest" "C:\WINDOWS\System32\scrrun.dll")
//
// WARNING: Do not remove the comments that include "@com" directives.
// This source file must be compiled by a @com-aware compiler.
// If you are using the Microsoft Visual J++ compiler, you must use
// version 1.02.3920 or later. Previous versions will not issue an error
// but will not generate COM-enabled class files.
//

package scrrun;

import com.ms.com.*;
import com.ms.com.IUnknown;
import com.ms.com.Variant;

/** @com.class(classid=0BB02EC0-EF49-11CF-8940-00A0C9054228,DynamicCasts) 
    @com.interface(iid=53BAD8C1-E718-11CF-893D-00A0C9054228, thread=AUTO, type=DUAL) */
public class TextStream implements IUnknown,com.ms.com.NoAutoScripting,scrrun.ITextStream
{
  /** @com.method(vtoffset=4, dispid=10000, type=PROPGET, name="Line", name2="getLine", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getLine();

  /** @com.method(vtoffset=5, dispid=4294966767, type=PROPGET, name="Column", name2="getColumn", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getColumn();

  /** @com.method(vtoffset=6, dispid=10002, type=PROPGET, name="AtEndOfStream", name2="getAtEndOfStream", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public native boolean getAtEndOfStream();

  /** @com.method(vtoffset=7, dispid=10003, type=PROPGET, name="AtEndOfLine", name2="getAtEndOfLine", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public native boolean getAtEndOfLine();

  /** @com.method(vtoffset=8, dispid=10004, type=METHOD, name="Read", addFlagsVtable=4)
      @com.parameters([in,type=I4] Characters, [type=STRING] return) */
  public native String Read(int Characters);

  /** @com.method(vtoffset=9, dispid=10005, type=METHOD, name="ReadLine", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public native String ReadLine();

  /** @com.method(vtoffset=10, dispid=10006, type=METHOD, name="ReadAll", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public native String ReadAll();

  /** @com.method(vtoffset=11, dispid=10007, type=METHOD, name="Write", addFlagsVtable=4)
      @com.parameters([in,type=STRING] Text) */
  public native void Write(String Text);

  /** @com.method(vtoffset=12, dispid=10008, type=METHOD, name="WriteLine", addFlagsVtable=4)
      @com.parameters([in,type=STRING] Text) */
  public native void WriteLine(String Text);

  /** @com.method(vtoffset=13, dispid=10009, type=METHOD, name="WriteBlankLines", addFlagsVtable=4)
      @com.parameters([in,type=I4] Lines) */
  public native void WriteBlankLines(int Lines);

  /** @com.method(vtoffset=14, dispid=10010, type=METHOD, name="Skip", addFlagsVtable=4)
      @com.parameters([in,type=I4] Characters) */
  public native void Skip(int Characters);

  /** @com.method(vtoffset=15, dispid=10011, type=METHOD, name="SkipLine", addFlagsVtable=4)
      @com.parameters() */
  public native void SkipLine();

  /** @com.method(vtoffset=16, dispid=10012, type=METHOD, name="Close", addFlagsVtable=4)
      @com.parameters() */
  public native void Close();


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0x53bad8c1, (short)0xe718, (short)0x11cf, (byte)0x89, (byte)0x3d, (byte)0x0, (byte)0xa0, (byte)0xc9, (byte)0x5, (byte)0x42, (byte)0x28);

  public static final com.ms.com._Guid clsid = new com.ms.com._Guid((int)0xbb02ec0, (short)0xef49, (short)0x11cf, (byte)0x89, (byte)0x40, (byte)0x0, (byte)0xa0, (byte)0xc9, (byte)0x5, (byte)0x42, (byte)0x28);
}
