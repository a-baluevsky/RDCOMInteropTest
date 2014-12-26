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

/** @com.class(classid=32DA2B15-CFED-11D1-B747-00C04FC2B085,DynamicCasts) 
    @com.interface(iid=AADC65F6-CFF1-11D1-B747-00C04FC2B085, thread=AUTO, type=DUAL) */
public class Encoder implements IUnknown,com.ms.com.NoAutoScripting,scrrun.IScriptEncoder
{
  /** @com.method(vtoffset=4, dispid=0, type=METHOD, name="EncodeScriptFile", addFlagsVtable=4)
      @com.parameters([in,type=STRING] szExt, [in,type=STRING] bstrStreamIn, [in,type=I4] cFlags, [in,type=STRING] bstrDefaultLang, [type=STRING] return) */
  public native String EncodeScriptFile(String szExt, String bstrStreamIn, int cFlags, String bstrDefaultLang);


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0xaadc65f6, (short)0xcff1, (short)0x11d1, (byte)0xb7, (byte)0x47, (byte)0x0, (byte)0xc0, (byte)0x4f, (byte)0xc2, (byte)0xb0, (byte)0x85);

  public static final com.ms.com._Guid clsid = new com.ms.com._Guid((int)0x32da2b15, (short)0xcfed, (short)0x11d1, (byte)0xb7, (byte)0x47, (byte)0x0, (byte)0xc0, (byte)0x4f, (byte)0xc2, (byte)0xb0, (byte)0x85);
}
