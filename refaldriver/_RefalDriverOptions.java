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

// Dual interface _RefalDriverOptions
/** @com.interface(iid=2C5503EF-159C-4599-AE55-33355F14EE4A, thread=AUTO, type=DUAL) */
public interface _RefalDriverOptions extends IUnknown
{
  /** @com.method(vtoffset=4, dispid=1073938438, type=PROPGET, name="MaxWaitCyclesCount", name2="getMaxWaitCyclesCount", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getMaxWaitCyclesCount();

  /** @com.method(vtoffset=5, dispid=1073938438, type=PROPPUT, name="MaxWaitCyclesCount", name2="putMaxWaitCyclesCount", addFlagsVtable=4)
      @com.parameters([in,type=I4] MaxWaitCyclesCount) */
  public void setMaxWaitCyclesCount(int MaxWaitCyclesCount);

  /** @com.method(vtoffset=6, dispid=1073938439, type=PROPGET, name="WaitCyclesDelayTime", name2="getWaitCyclesDelayTime", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getWaitCyclesDelayTime();

  /** @com.method(vtoffset=7, dispid=1073938439, type=PROPPUT, name="WaitCyclesDelayTime", name2="putWaitCyclesDelayTime", addFlagsVtable=4)
      @com.parameters([in,type=I4] WaitCyclesDelayTime) */
  public void setWaitCyclesDelayTime(int WaitCyclesDelayTime);

  /** @com.method(vtoffset=8, dispid=1073938440, type=PROPGET, name="StartupPath", name2="getStartupPath", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public String getStartupPath();

  /** @com.method(vtoffset=9, dispid=1073938440, type=PROPPUT, name="StartupPath", name2="putStartupPath", addFlagsVtable=4)
      @com.parameters([in,type=STRING] StartupPath) */
  public void setStartupPath(String StartupPath);

  /** @com.method(vtoffset=10, dispid=1073938441, type=PROPGET, name="TerminationCharSequence", name2="getTerminationCharSequence", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public String getTerminationCharSequence();

  /** @com.method(vtoffset=11, dispid=1073938441, type=PROPPUT, name="TerminationCharSequence", name2="putTerminationCharSequence", addFlagsVtable=4)
      @com.parameters([in,type=STRING] TerminationCharSequence) */
  public void setTerminationCharSequence(String TerminationCharSequence);

  /** @com.method(vtoffset=12, dispid=1073938442, type=PROPGET, name="UsePipes", name2="getUsePipes", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getUsePipes();

  /** @com.method(vtoffset=13, dispid=1073938442, type=PROPPUT, name="UsePipes", name2="putUsePipes", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] UsePipes) */
  public void setUsePipes(boolean UsePipes);

  /** @com.method(vtoffset=14, dispid=1745027078, type=PROPGET, name="MemoryLimit", name2="getMemoryLimit", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getMemoryLimit();

  /** @com.method(vtoffset=15, dispid=1745027078, type=PROPPUT, name="MemoryLimit", name2="putMemoryLimit", addFlagsVtable=4)
      @com.parameters([in,type=I4] _jcomparam_0) */
  public void setMemoryLimit(int _jcomparam_0);

  /** @com.method(vtoffset=16, dispid=1745027077, type=PROPGET, name="DisplayConsole", name2="getDisplayConsole", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getDisplayConsole();

  /** @com.method(vtoffset=17, dispid=1745027077, type=PROPPUT, name="DisplayConsole", name2="putDisplayConsole", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] _jcomparam_0) */
  public void setDisplayConsole(boolean _jcomparam_0);

  /** @com.method(vtoffset=18, dispid=1745027076, type=PROPPUT, name="PathREFTR", name2="putPathREFTR", addFlagsVtable=4)
      @com.parameters([in,type=STRING] _jcomparam_0) */
  public void setPathREFTR(String _jcomparam_0);

  /** @com.method(vtoffset=19, dispid=1745027076, type=PROPGET, name="PathREFTR", name2="getPathREFTR", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public String getPathREFTR();

  /** @com.method(vtoffset=20, dispid=1745027075, type=PROPPUT, name="PathREFGO", name2="putPathREFGO", addFlagsVtable=4)
      @com.parameters([in,type=STRING] _jcomparam_0) */
  public void setPathREFGO(String _jcomparam_0);

  /** @com.method(vtoffset=21, dispid=1745027075, type=PROPGET, name="PathREFGO", name2="getPathREFGO", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public String getPathREFGO();

  /** @com.method(vtoffset=22, dispid=1745027074, type=PROPPUT, name="PathREFC", name2="putPathREFC", addFlagsVtable=4)
      @com.parameters([in,type=STRING] _jcomparam_0) */
  public void setPathREFC(String _jcomparam_0);

  /** @com.method(vtoffset=23, dispid=1745027074, type=PROPGET, name="PathREFC", name2="getPathREFC", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public String getPathREFC();

  /** @com.method(vtoffset=24, dispid=1745027073, type=PROPPUT, name="RefalVersion", name2="putRefalVersion", addFlagsVtable=4)
      @com.parameters([in,type=STRING] _jcomparam_0) */
  public void setRefalVersion(String _jcomparam_0);

  /** @com.method(vtoffset=25, dispid=1745027073, type=PROPGET, name="RefalVersion", name2="getRefalVersion", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public String getRefalVersion();

  /** @com.method(vtoffset=26, dispid=1745027072, type=PROPPUT, name="RefalPath", name2="putRefalPath", addFlagsVtable=4)
      @com.parameters([in,type=STRING] _jcomparam_0) */
  public void setRefalPath(String _jcomparam_0);

  /** @com.method(vtoffset=27, dispid=1745027072, type=PROPGET, name="RefalPath", name2="getRefalPath", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public String getRefalPath();

  /** @com.method(vtoffset=28, dispid=1610809353, type=METHOD, name="GetCmdLine", addFlagsVtable=4)
      @com.parameters([in,out,elementType=VARIANT,type=PTR] Arguments, [type=STRING] return) */
  public String GetCmdLine(Variant Arguments);


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0x2c5503ef, (short)0x159c, (short)0x4599, (byte)0xae, (byte)0x55, (byte)0x33, (byte)0x35, (byte)0x5f, (byte)0x14, (byte)0xee, (byte)0x4a);
}
