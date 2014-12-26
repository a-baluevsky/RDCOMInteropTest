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

// Dual interface _RefalDriverEngine
/** @com.interface(iid=2079A6CF-82D5-4924-A08F-D1454ABE92CA, thread=AUTO, type=DUAL) */
public interface _RefalDriverEngine extends IUnknown
{
  /** @com.method(vtoffset=4, dispid=1745027075, type=PROPGET, name="Assemblies", name2="getAssemblies", addFlagsVtable=4)
      @com.parameters([iid=4133908E-0E93-45F5-B1C0-ED17DA78BFE4,thread=AUTO,type=DISPATCH] return) */
  public refaldriver._RefalAssemblies getAssemblies();

  /** @com.method(vtoffset=5, dispid=1745027074, type=PROPGET, name="Modules", name2="getModules", addFlagsVtable=4)
      @com.parameters([iid=67CE9E64-2A56-4D73-956C-28676203D932,thread=AUTO,type=DISPATCH] return) */
  public refaldriver._RefalModules getModules();

  /** @com.method(vtoffset=6, dispid=1745027073, type=PROPGET, name="DriverOptions", name2="getDriverOptions", addFlagsVtable=4)
      @com.parameters([iid=2C5503EF-159C-4599-AE55-33355F14EE4A,thread=AUTO,type=DISPATCH] return) */
  public refaldriver._RefalDriverOptions getDriverOptions();

  /** @com.method(vtoffset=7, dispid=1745027072, type=PROPGET, name="Utility", name2="getUtility", addFlagsVtable=4)
      @com.parameters([iid=4B4676E6-0976-4BF4-A443-CA567BE6E24F,thread=AUTO,type=DISPATCH] return) */
  public refaldriver._Utility getUtility();

  /** @com.method(vtoffset=8, dispid=1610809350, type=METHOD, name="Compile", addFlagsVtable=4)
      @com.parameters([in,out,size=1,elementType=STRING,type=ARRAY] RefalModuleName, [in,out,size=1,elementType=STRING,type=ARRAY] RefFileName, [iid=655C7C21-14E0-466B-B5FA-1EC9749E18AF,thread=AUTO,type=DISPATCH] return) */
  public refaldriver._RefalModule Compile(String[] RefalModuleName, String[] RefFileName);

  /** @com.method(vtoffset=9, dispid=1610809351, type=METHOD, name="Run", addFlagsVtable=4)
      @com.parameters([in,out,size=1,elementType=STRING,type=ARRAY] AssemblyName, [in,out,size=1,elementType=STRING,type=ARRAY] CommandLine, [in,out,size=1,elementType=STRING,type=ARRAY] InputData, [in,out,size=1,elementType=STRING,type=ARRAY] OutputData, [type=I4] return) */
  public int Run(String[] AssemblyName, String[] CommandLine, String[] InputData, String[] OutputData);

  /** @com.method(vtoffset=10, dispid=1610809352, type=METHOD, name="ExecuteRefalCode", addFlagsVtable=4)
      @com.parameters([in,out,elementType=VARIANT,type=PTR] AutoTemplateOptions, [in,out,size=1,elementType=STRING,type=ARRAY] RefalCode, [in,out,size=1,elementType=STRING,type=ARRAY] InputData, [in,out,size=1,elementType=STRING,type=ARRAY] OutputData, [type=I4] return) */
  public int ExecuteRefalCode(Variant AutoTemplateOptions, String[] RefalCode, String[] InputData, String[] OutputData);


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0x2079a6cf, (short)0x82d5, (short)0x4924, (byte)0xa0, (byte)0x8f, (byte)0xd1, (byte)0x45, (byte)0x4a, (byte)0xbe, (byte)0x92, (byte)0xca);
}
