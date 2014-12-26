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

// Dual interface IFileSystem3
/** @com.interface(iid=2A0B9D10-4B87-11D3-A97A-00104B365C9F, thread=AUTO, type=DUAL) */
public interface IFileSystem3 extends scrrun.IFileSystem
{
  /** @com.method(vtoffset=4, dispid=10010, type=PROPGET, name="Drives", name2="getDrives", addFlagsVtable=4)
      @com.parameters([iid=C7C3F5A1-88A3-11D0-ABCB-00A0C90FFFC0,thread=AUTO,type=DISPATCH] return) */
  public scrrun.IDriveCollection getDrives();

  /** @com.method(vtoffset=5, dispid=10000, type=METHOD, name="BuildPath", addFlagsVtable=4)
      @com.parameters([in,type=STRING] Path, [in,type=STRING] Name, [type=STRING] return) */
  public String BuildPath(String Path, String Name);

  /** @com.method(vtoffset=6, dispid=10004, type=METHOD, name="GetDriveName", addFlagsVtable=4)
      @com.parameters([in,type=STRING] Path, [type=STRING] return) */
  public String GetDriveName(String Path);

  /** @com.method(vtoffset=7, dispid=10005, type=METHOD, name="GetParentFolderName", addFlagsVtable=4)
      @com.parameters([in,type=STRING] Path, [type=STRING] return) */
  public String GetParentFolderName(String Path);

  /** @com.method(vtoffset=8, dispid=10006, type=METHOD, name="GetFileName", addFlagsVtable=4)
      @com.parameters([in,type=STRING] Path, [type=STRING] return) */
  public String GetFileName(String Path);

  /** @com.method(vtoffset=9, dispid=10007, type=METHOD, name="GetBaseName", addFlagsVtable=4)
      @com.parameters([in,type=STRING] Path, [type=STRING] return) */
  public String GetBaseName(String Path);

  /** @com.method(vtoffset=10, dispid=10008, type=METHOD, name="GetExtensionName", addFlagsVtable=4)
      @com.parameters([in,type=STRING] Path, [type=STRING] return) */
  public String GetExtensionName(String Path);

  /** @com.method(vtoffset=11, dispid=10002, type=METHOD, name="GetAbsolutePathName", addFlagsVtable=4)
      @com.parameters([in,type=STRING] Path, [type=STRING] return) */
  public String GetAbsolutePathName(String Path);

  /** @com.method(vtoffset=12, dispid=10003, type=METHOD, name="GetTempName", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public String GetTempName();

  /** @com.method(vtoffset=13, dispid=10015, type=METHOD, name="DriveExists", addFlagsVtable=4)
      @com.parameters([in,type=STRING] DriveSpec, [type=BOOLEAN] return) */
  public boolean DriveExists(String DriveSpec);

  /** @com.method(vtoffset=14, dispid=10016, type=METHOD, name="FileExists", addFlagsVtable=4)
      @com.parameters([in,type=STRING] FileSpec, [type=BOOLEAN] return) */
  public boolean FileExists(String FileSpec);

  /** @com.method(vtoffset=15, dispid=10017, type=METHOD, name="FolderExists", addFlagsVtable=4)
      @com.parameters([in,type=STRING] FolderSpec, [type=BOOLEAN] return) */
  public boolean FolderExists(String FolderSpec);

  /** @com.method(vtoffset=16, dispid=10011, type=METHOD, name="GetDrive", addFlagsVtable=4)
      @com.parameters([in,type=STRING] DriveSpec, [iid=C7C3F5A0-88A3-11D0-ABCB-00A0C90FFFC0,thread=AUTO,type=DISPATCH] return) */
  public scrrun.IDrive GetDrive(String DriveSpec);

  /** @com.method(vtoffset=17, dispid=10012, type=METHOD, name="GetFile", addFlagsVtable=4)
      @com.parameters([in,type=STRING] FilePath, [iid=C7C3F5A4-88A3-11D0-ABCB-00A0C90FFFC0,thread=AUTO,type=DISPATCH] return) */
  public scrrun.IFile GetFile(String FilePath);

  /** @com.method(vtoffset=18, dispid=10013, type=METHOD, name="GetFolder", addFlagsVtable=4)
      @com.parameters([in,type=STRING] FolderPath, [iid=C7C3F5A2-88A3-11D0-ABCB-00A0C90FFFC0,thread=AUTO,type=DISPATCH] return) */
  public scrrun.IFolder GetFolder(String FolderPath);

  /** @com.method(vtoffset=19, dispid=10014, type=METHOD, name="GetSpecialFolder", addFlagsVtable=4)
      @com.parameters([in,type=I4] SpecialFolder, [iid=C7C3F5A2-88A3-11D0-ABCB-00A0C90FFFC0,thread=AUTO,type=DISPATCH] return) */
  public scrrun.IFolder GetSpecialFolder(int SpecialFolder);

  /** @com.method(vtoffset=20, dispid=1200, type=METHOD, name="DeleteFile", addFlagsVtable=4)
      @com.parameters([in,type=STRING] FileSpec, [in,type=BOOLEAN] Force) */
  public void DeleteFile(String FileSpec, boolean Force);

  /** @com.method(vtoffset=21, dispid=1201, type=METHOD, name="DeleteFolder", addFlagsVtable=4)
      @com.parameters([in,type=STRING] FolderSpec, [in,type=BOOLEAN] Force) */
  public void DeleteFolder(String FolderSpec, boolean Force);

  /** @com.method(vtoffset=22, dispid=1204, type=METHOD, name="MoveFile", addFlagsVtable=4)
      @com.parameters([in,type=STRING] Source, [in,type=STRING] Destination) */
  public void MoveFile(String Source, String Destination);

  /** @com.method(vtoffset=23, dispid=1205, type=METHOD, name="MoveFolder", addFlagsVtable=4)
      @com.parameters([in,type=STRING] Source, [in,type=STRING] Destination) */
  public void MoveFolder(String Source, String Destination);

  /** @com.method(vtoffset=24, dispid=1202, type=METHOD, name="CopyFile", addFlagsVtable=4)
      @com.parameters([in,type=STRING] Source, [in,type=STRING] Destination, [in,type=BOOLEAN] OverWriteFiles) */
  public void CopyFile(String Source, String Destination, boolean OverWriteFiles);

  /** @com.method(vtoffset=25, dispid=1203, type=METHOD, name="CopyFolder", addFlagsVtable=4)
      @com.parameters([in,type=STRING] Source, [in,type=STRING] Destination, [in,type=BOOLEAN] OverWriteFiles) */
  public void CopyFolder(String Source, String Destination, boolean OverWriteFiles);

  /** @com.method(vtoffset=26, dispid=1120, type=METHOD, name="CreateFolder", addFlagsVtable=4)
      @com.parameters([in,type=STRING] Path, [iid=C7C3F5A2-88A3-11D0-ABCB-00A0C90FFFC0,thread=AUTO,type=DISPATCH] return) */
  public scrrun.IFolder CreateFolder(String Path);

  /** @com.method(vtoffset=27, dispid=1101, type=METHOD, name="CreateTextFile", addFlagsVtable=4)
      @com.parameters([in,type=STRING] FileName, [in,type=BOOLEAN] Overwrite, [in,type=BOOLEAN] Unicode, [iid=53BAD8C1-E718-11CF-893D-00A0C9054228,thread=AUTO,type=DISPATCH] return) */
  public scrrun.ITextStream CreateTextFile(String FileName, boolean Overwrite, boolean Unicode);

  /** @com.method(vtoffset=28, dispid=1100, type=METHOD, name="OpenTextFile", addFlagsVtable=4)
      @com.parameters([in,type=STRING] FileName, [in,type=I4] IOMode, [in,type=BOOLEAN] Create, [in,type=I4] Format, [iid=53BAD8C1-E718-11CF-893D-00A0C9054228,thread=AUTO,type=DISPATCH] return) */
  public scrrun.ITextStream OpenTextFile(String FileName, int IOMode, boolean Create, int Format);

  /** @com.method(vtoffset=29, dispid=20000, type=METHOD, name="GetStandardStream", addFlagsVtable=4)
      @com.parameters([in,type=I4] StandardStreamType, [in,type=BOOLEAN] Unicode, [iid=53BAD8C1-E718-11CF-893D-00A0C9054228,thread=AUTO,type=DISPATCH] return) */
  public scrrun.ITextStream GetStandardStream(int StandardStreamType, boolean Unicode);

  /** @com.method(vtoffset=30, dispid=20010, type=METHOD, name="GetFileVersion", addFlagsVtable=4)
      @com.parameters([in,type=STRING] FileName, [type=STRING] return) */
  public String GetFileVersion(String FileName);


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0x2a0b9d10, (short)0x4b87, (short)0x11d3, (byte)0xa9, (byte)0x7a, (byte)0x0, (byte)0x10, (byte)0x4b, (byte)0x36, (byte)0x5c, (byte)0x9f);
}
