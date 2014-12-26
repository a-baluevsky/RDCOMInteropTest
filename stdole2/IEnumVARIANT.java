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

package stdole2;

import com.ms.com.*;
import com.ms.com.IUnknown;
import com.ms.com.Variant;
import refaldriver.*;

// VTable-only interface IEnumVARIANT
/** @com.interface(iid=00020404-0000-0000-C000-000000000046, thread=AUTO) */
public interface IEnumVARIANT extends IUnknown
{
  /** @com.method(vtoffset=0, addFlagsVtable=4)
      @com.parameters([in,type=U4] celt, [in,type=PTR] rgvar, [out,size=1,type=ARRAY] pceltFetched) */
  public void Next(int celt, Variant rgvar, int[] pceltFetched);

  /** @com.method(vtoffset=1, addFlagsVtable=4)
      @com.parameters([in,type=U4] celt) */
  public void Skip(int celt);

  /** @com.method(vtoffset=2, addFlagsVtable=4)
      @com.parameters() */
  public void Reset();

  /** @com.method(vtoffset=3, addFlagsVtable=4)
      @com.parameters([out,size=1,type=ARRAY] ppenum) */
  public void Clone(stdole2.IEnumVARIANT[] ppenum);


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0x20404, (short)0x0, (short)0x0, (byte)0xc0, (byte)0x0, (byte)0x0, (byte)0x0, (byte)0x0, (byte)0x0, (byte)0x0, (byte)0x46);
}
