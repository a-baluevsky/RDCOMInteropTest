//
// Auto-generated using JActiveX.EXE 5.00.2918
//   ("C:\Program Files\Microsoft Visual Studio\VJ98\jactivex.exe" /wfc  /w /xi /X:rkc /l "C:\DOCUME~1\a\LOCALS~1\Temp\jvcB4.tmp" /nologo /d "C:\Projects\JRefalDriver\RDCOMInteropTest" "C:\Refal5\RefalDriver\RefalDriver.dll")
//
// WARNING: Do not remove the comments that include "@com" directives.
// This source file must be compiled by a @com-aware compiler.
// If you are using the Microsoft Visual J++ compiler, you must use
// version 1.02.3920 or later. Previous versions will not issue an error
// but will not generate COM-enabled class files.
//

package refaldriver;

import com.ms.com.*;
import com.ms.com.IUnknown;
import com.ms.com.Variant;
import stdole2.*;

// Dual interface _RefalModule
/** @com.interface(iid=655C7C21-14E0-466B-B5FA-1EC9749E18AF, thread=AUTO, type=DUAL) */
public interface _RefalModule extends IUnknown
{
  /** @com.method(vtoffset=4, dispid=1745027073, type=PROPGET, name="RslFileName", name2="getRslFileName", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public String getRslFileName();

  /** @com.method(vtoffset=5, dispid=1745027072, type=PROPGET, name="RefFileName", name2="getRefFileName", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public String getRefFileName();

  /** @com.method(vtoffset=6, dispid=0, type=PROPGET, name="ModuleName", name2="getModuleName", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public String getModuleName();


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0x655c7c21, (short)0x14e0, (short)0x466b, (byte)0xb5, (byte)0xfa, (byte)0x1e, (byte)0xc9, (byte)0x74, (byte)0x9e, (byte)0x18, (byte)0xaf);
}
