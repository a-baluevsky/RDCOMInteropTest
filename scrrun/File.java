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

/** @com.class(classid=C7C3F5B5-88A3-11D0-ABCB-00A0C90FFFC0,DynamicCasts) 
    @com.interface(iid=C7C3F5A4-88A3-11D0-ABCB-00A0C90FFFC0, thread=AUTO, type=DUAL) */
public class File implements IUnknown,com.ms.com.NoAutoScripting,scrrun.IFile
{
  /** @com.method(vtoffset=4, dispid=0, type=PROPGET, name="Path", name2="getPath", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public native String getPath();

  /** @com.method(vtoffset=5, dispid=1000, type=PROPGET, name="Name", name2="getName", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public native String getName();

  /** @com.method(vtoffset=6, dispid=1000, type=PROPPUT, name="Name", name2="putName", addFlagsVtable=4)
      @com.parameters([in,type=STRING] pbstrName) */
  public native void setName(String pbstrName);

  /** @com.method(vtoffset=7, dispid=1002, type=PROPGET, name="ShortPath", name2="getShortPath", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public native String getShortPath();

  /** @com.method(vtoffset=8, dispid=1001, type=PROPGET, name="ShortName", name2="getShortName", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public native String getShortName();

  /** @com.method(vtoffset=9, dispid=1004, type=PROPGET, name="Drive", name2="getDrive", addFlagsVtable=4)
      @com.parameters([iid=C7C3F5A0-88A3-11D0-ABCB-00A0C90FFFC0,thread=AUTO,type=DISPATCH] return) */
  public native scrrun.IDrive getDrive();

  /** @com.method(vtoffset=10, dispid=1005, type=PROPGET, name="ParentFolder", name2="getParentFolder", addFlagsVtable=4)
      @com.parameters([iid=C7C3F5A2-88A3-11D0-ABCB-00A0C90FFFC0,thread=AUTO,type=DISPATCH] return) */
  public native scrrun.IFolder getParentFolder();

  /** @com.method(vtoffset=11, dispid=1003, type=PROPGET, name="Attributes", name2="getAttributes", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getAttributes();

  /** @com.method(vtoffset=12, dispid=1003, type=PROPPUT, name="Attributes", name2="putAttributes", addFlagsVtable=4)
      @com.parameters([in,type=I4] pfa) */
  public native void setAttributes(int pfa);

  /** @com.method(vtoffset=13, dispid=1006, type=PROPGET, name="DateCreated", name2="getDateCreated", addFlagsVtable=4)
      @com.parameters([type=DATE] return) */
  public native double getDateCreated();

  /** @com.method(vtoffset=14, dispid=1007, type=PROPGET, name="DateLastModified", name2="getDateLastModified", addFlagsVtable=4)
      @com.parameters([type=DATE] return) */
  public native double getDateLastModified();

  /** @com.method(vtoffset=15, dispid=1008, type=PROPGET, name="DateLastAccessed", name2="getDateLastAccessed", addFlagsVtable=4)
      @com.parameters([type=DATE] return) */
  public native double getDateLastAccessed();

  /** @com.method(vtoffset=16, dispid=1009, type=PROPGET, name="Size", name2="getSize", addFlagsVtable=4)
      @com.parameters([type=VARIANT] return) */
  public native Variant getSize();

  /** @com.method(vtoffset=17, dispid=1010, type=PROPGET, name="Type", name2="getType", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public native String getType();

  /** @com.method(vtoffset=18, dispid=1200, type=METHOD, name="Delete", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] Force) */
  public native void Delete(boolean Force);

  /** @com.method(vtoffset=19, dispid=1202, type=METHOD, name="Copy", addFlagsVtable=4)
      @com.parameters([in,type=STRING] Destination, [in,type=BOOLEAN] OverWriteFiles) */
  public native void Copy(String Destination, boolean OverWriteFiles);

  /** @com.method(vtoffset=20, dispid=1204, type=METHOD, name="Move", addFlagsVtable=4)
      @com.parameters([in,type=STRING] Destination) */
  public native void Move(String Destination);

  /** @com.method(vtoffset=21, dispid=1100, type=METHOD, name="OpenAsTextStream", addFlagsVtable=4)
      @com.parameters([in,type=I4] IOMode, [in,type=I4] Format, [iid=53BAD8C1-E718-11CF-893D-00A0C9054228,thread=AUTO,type=DISPATCH] return) */
  public native scrrun.ITextStream OpenAsTextStream(int IOMode, int Format);


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0xc7c3f5a4, (short)0x88a3, (short)0x11d0, (byte)0xab, (byte)0xcb, (byte)0x0, (byte)0xa0, (byte)0xc9, (byte)0xf, (byte)0xff, (byte)0xc0);

  public static final com.ms.com._Guid clsid = new com.ms.com._Guid((int)0xc7c3f5b5, (short)0x88a3, (short)0x11d0, (byte)0xab, (byte)0xcb, (byte)0x0, (byte)0xa0, (byte)0xc9, (byte)0xf, (byte)0xff, (byte)0xc0);
}
