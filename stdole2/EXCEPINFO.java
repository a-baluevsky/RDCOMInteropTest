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

/** @com.struct(noAutoOffset) */


public final class EXCEPINFO
{
  /** @com.structmap([offset=0,type=U2] wCode) */
  public short wCode;

  /** @com.structmap([offset=2,type=U2] wReserved) */
  public short wReserved;

  /** @com.structmap([offset=4,type=STRING] bstrSource) */
  public String bstrSource;

  /** @com.structmap([offset=8,type=STRING] bstrDescription) */
  public String bstrDescription;

  /** @com.structmap([offset=12,type=STRING] bstrHelpFile) */
  public String bstrHelpFile;

  /** @com.structmap([offset=16,type=U4] dwHelpContext) */
  public int dwHelpContext;

// UNMAPPABLE: pvReserved: Too many indirections.
//   /** @com.structmap(UNMAPPABLE pvReserved) */
//  public UNMAPPABLE pvReserved;

// UNMAPPABLE: pfnDeferredFillIn: Too many indirections.
//   /** @com.structmap(UNMAPPABLE pfnDeferredFillIn) */
//  public UNMAPPABLE pfnDeferredFillIn;

  /** @com.structmap([offset=28,type=I4] scode) */
  public int scode;

}
