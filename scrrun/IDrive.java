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

// Dual interface IDrive
/** @com.interface(iid=C7C3F5A0-88A3-11D0-ABCB-00A0C90FFFC0, thread=AUTO, type=DUAL) */
public interface IDrive extends IUnknown
{
  /** @com.method(vtoffset=4, dispid=0, type=PROPGET, name="Path", name2="getPath", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public String getPath();

  /** @com.method(vtoffset=5, dispid=10000, type=PROPGET, name="DriveLetter", name2="getDriveLetter", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public String getDriveLetter();

  /** @com.method(vtoffset=6, dispid=10001, type=PROPGET, name="ShareName", name2="getShareName", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public String getShareName();

  /** @com.method(vtoffset=7, dispid=10002, type=PROPGET, name="DriveType", name2="getDriveType", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getDriveType();

  /** @com.method(vtoffset=8, dispid=10003, type=PROPGET, name="RootFolder", name2="getRootFolder", addFlagsVtable=4)
      @com.parameters([iid=C7C3F5A2-88A3-11D0-ABCB-00A0C90FFFC0,thread=AUTO,type=DISPATCH] return) */
  public scrrun.IFolder getRootFolder();

  /** @com.method(vtoffset=9, dispid=10005, type=PROPGET, name="AvailableSpace", name2="getAvailableSpace", addFlagsVtable=4)
      @com.parameters([type=VARIANT] return) */
  public Variant getAvailableSpace();

  /** @com.method(vtoffset=10, dispid=10004, type=PROPGET, name="FreeSpace", name2="getFreeSpace", addFlagsVtable=4)
      @com.parameters([type=VARIANT] return) */
  public Variant getFreeSpace();

  /** @com.method(vtoffset=11, dispid=10006, type=PROPGET, name="TotalSize", name2="getTotalSize", addFlagsVtable=4)
      @com.parameters([type=VARIANT] return) */
  public Variant getTotalSize();

  /** @com.method(vtoffset=12, dispid=10007, type=PROPGET, name="VolumeName", name2="getVolumeName", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public String getVolumeName();

  /** @com.method(vtoffset=13, dispid=10007, type=PROPPUT, name="VolumeName", name2="putVolumeName", addFlagsVtable=4)
      @com.parameters([in,type=STRING] pbstrName) */
  public void setVolumeName(String pbstrName);

  /** @com.method(vtoffset=14, dispid=10008, type=PROPGET, name="FileSystem", name2="getFileSystem", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public String getFileSystem();

  /** @com.method(vtoffset=15, dispid=10009, type=PROPGET, name="SerialNumber", name2="getSerialNumber", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getSerialNumber();

  /** @com.method(vtoffset=16, dispid=10010, type=PROPGET, name="IsReady", name2="getIsReady", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getIsReady();


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0xc7c3f5a0, (short)0x88a3, (short)0x11d0, (byte)0xab, (byte)0xcb, (byte)0x0, (byte)0xa0, (byte)0xc9, (byte)0xf, (byte)0xff, (byte)0xc0);
}
