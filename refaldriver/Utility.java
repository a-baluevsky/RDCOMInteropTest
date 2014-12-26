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

/** @com.class(classid=868B28EF-0AE7-493D-B478-29EBDD2CCE33,DynamicCasts) 
    @com.interface(iid=4B4676E6-0976-4BF4-A443-CA567BE6E24F, thread=AUTO, type=DUAL) */
public class Utility implements IUnknown,com.ms.com.NoAutoScripting,refaldriver._Utility
{
  /** @com.method(vtoffset=4, dispid=1610809345, type=METHOD, name="ExpandEnvironmentStrings", addFlagsVtable=4)
      @com.parameters([in,type=STRING] EnvStringExpr, [type=STRING] return) */
  public native String ExpandEnvironmentStrings(String EnvStringExpr);

  /** @com.method(vtoffset=5, dispid=1745027072, type=PROPGET, name="RefalScriptTemplatePath", name2="getRefalScriptTemplatePath", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public native String getRefalScriptTemplatePath();

  /** @com.method(vtoffset=6, dispid=1610809346, type=METHOD, name="WriteRefalScript", addFlagsVtable=4)
      @com.parameters([in,out,size=1,elementType=STRING,type=ARRAY] RefFileName, [in,out,elementType=VARIANT,type=PTR] RefalScriptSource, [type=BOOLEAN] return) */
  public native boolean WriteRefalScript(String[] RefFileName, Variant RefalScriptSource);

  /** @com.method(vtoffset=7, dispid=1610809347, type=METHOD, name="ReadRefalScript", addFlagsVtable=4)
      @com.parameters([in,out,size=1,elementType=STRING,type=ARRAY] RefFileName, [in,out,elementType=VARIANT,type=PTR] RefalScriptSource, [type=BOOLEAN] return) */
  public native boolean ReadRefalScript(String[] RefFileName, Variant RefalScriptSource);

  /** @com.method(vtoffset=8, dispid=1610809348, type=METHOD, name="ConvFromAscToAnsi", addFlagsVtable=4)
      @com.parameters([in,out,size=1,elementType=STRING,type=ARRAY] AscText, [type=STRING] return) */
  public native String ConvFromAscToAnsi(String[] AscText);

  /** @com.method(vtoffset=9, dispid=1610809349, type=METHOD, name="ConvFromAnsiToAsc", addFlagsVtable=4)
      @com.parameters([in,out,size=1,elementType=STRING,type=ARRAY] AnsiText, [type=STRING] return) */
  public native String ConvFromAnsiToAsc(String[] AnsiText);

  /** @com.method(vtoffset=10, dispid=1610809350, type=METHOD, name="ExtractFileName", addFlagsVtable=4)
      @com.parameters([in,out,size=1,elementType=STRING,type=ARRAY] FilePath, [type=STRING] return) */
  public native String ExtractFileName(String[] FilePath);

  /** @com.method(vtoffset=11, dispid=1610809351, type=METHOD, name="GetTempFile", addFlagsVtable=4)
      @com.parameters([in,out,size=1,elementType=STRING,type=ARRAY] Prefix, [in,out,size=1,elementType=STRING,type=ARRAY] TempFilePath, [in,out,size=1,elementType=I4,type=ARRAY] UniqueID, [type=STRING] return) */
  public native String GetTempFile(String[] Prefix, String[] TempFilePath, int[] UniqueID);


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0x4b4676e6, (short)0x976, (short)0x4bf4, (byte)0xa4, (byte)0x43, (byte)0xca, (byte)0x56, (byte)0x7b, (byte)0xe6, (byte)0xe2, (byte)0x4f);

  public static final com.ms.com._Guid clsid = new com.ms.com._Guid((int)0x868b28ef, (short)0xae7, (short)0x493d, (byte)0xb4, (byte)0x78, (byte)0x29, (byte)0xeb, (byte)0xdd, (byte)0x2c, (byte)0xce, (byte)0x33);
}
