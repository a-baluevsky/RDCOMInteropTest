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

// Dual interface _RefalAssembly
/** @com.interface(iid=A4E7EE28-0B57-4E63-A058-7A91997E8530, thread=AUTO, type=DUAL) */
public interface _RefalAssembly extends IUnknown
{
  /** @com.method(vtoffset=4, dispid=1745027073, type=PROPGET, name="AssemblyName", name2="getAssemblyName", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public String getAssemblyName();

  /** @com.method(vtoffset=5, dispid=1610809346, type=METHOD, name="AddModule", addFlagsVtable=4)
      @com.parameters([in,out,size=1,elementType=DISPATCH,type=ARRAY] RefalModule) */
  public void AddModule(refaldriver._RefalModule[] RefalModule);

  /** @com.method(vtoffset=6, dispid=0, type=PROPGET, name="Item", name2="getItem", addFlagsVtable=4)
      @com.parameters([in,out,elementType=VARIANT,type=PTR] vntIndexKey, [iid=655C7C21-14E0-466B-B5FA-1EC9749E18AF,thread=AUTO,type=DISPATCH] return) */
  public refaldriver._RefalModule getItem(Variant vntIndexKey);

  /** @com.method(vtoffset=7, dispid=1745027072, type=PROPGET, name="ModulesCount", name2="getModulesCount", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getModulesCount();

  /** @com.method(vtoffset=8, dispid=1610809347, type=METHOD, name="RemoveModule", addFlagsVtable=4)
      @com.parameters([in,out,elementType=VARIANT,type=PTR] ModuleNameIndex) */
  public void RemoveModule(Variant ModuleNameIndex);

  /** @com.method(vtoffset=9, dispid=4294967292, type=PROPGET, name="NewEnum", name2="getNewEnum", addFlagsVtable=4)
      @com.parameters([iid=00000000-0000-0000-C000-000000000046,thread=AUTO,type=OBJECT] return)
      @hidden */
  public stdole2.IEnumVARIANT getNewEnum();

  /** @com.method(vtoffset=10, dispid=1610809350, type=METHOD, name="GetModuleListString", addFlagsVtable=4)
      @com.parameters([in,out,elementType=VARIANT,type=PTR] ModuleList, [type=STRING] return) */
  public String GetModuleListString(Variant ModuleList);

  /** @com.method(vtoffset=11, dispid=1610809351, type=METHOD, name="Run", addFlagsVtable=4)
      @com.parameters([in,out,size=1,elementType=STRING,type=ARRAY] CommandLine, [in,out,size=1,elementType=STRING,type=ARRAY] InputData, [in,out,size=1,elementType=STRING,type=ARRAY] OutputData, [type=I4] return) */
  public int Run(String[] CommandLine, String[] InputData, String[] OutputData);

  /** @com.method(vtoffset=12, dispid=1610809353, type=METHOD, name="Serialize", addFlagsVtable=4)
      @com.parameters([in,out,size=1,elementType=STRING,type=ARRAY] TargetRasmFileName, [type=STRING] return) */
  public String Serialize(String[] TargetRasmFileName);

  /** @com.method(vtoffset=13, dispid=1610809354, type=METHOD, name="FileSerialize", addFlagsVtable=4)
      @com.parameters([in,out,size=1,elementType=STRING,type=ARRAY] RasmFileName) */
  public void FileSerialize(String[] RasmFileName);

  /** @com.method(vtoffset=14, dispid=1610809355, type=METHOD, name="FileDeserialize", addFlagsVtable=4)
      @com.parameters([in,out,size=1,elementType=STRING,type=ARRAY] RasmFileName) */
  public void FileDeserialize(String[] RasmFileName);


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0xa4e7ee28, (short)0xb57, (short)0x4e63, (byte)0xa0, (byte)0x58, (byte)0x7a, (byte)0x91, (byte)0x99, (byte)0x7e, (byte)0x85, (byte)0x30);
}
