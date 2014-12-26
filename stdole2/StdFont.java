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

/** @com.class(classid=0BE35203-8F91-11CE-9DE3-00AA004BB851,DynamicCasts) 
    @com.interface(iid=BEF6E003-A874-101A-8BBA-00AA00300CAB, thread=AUTO, type=DISPATCH) */
public class StdFont implements IUnknown,com.ms.com.NoAutoScripting,stdole2.Font,stdole2.IFont
{

  /** @com.method(dispid=0, name="Name", type=PROPGET)
      @com.parameters([type=STRING] return) */
  public native String getName();


  /** @com.method(dispid=0, name="Name", type=PROPPUT)
      @com.parameters([in,type=STRING] newValue) */
  public native void setName(String newValue);


  /** @com.method(dispid=2, name="Size", type=PROPGET)
      @com.parameters([type=CURRENCY] return) */
  public native long getSize();


  /** @com.method(dispid=2, name="Size", type=PROPPUT)
      @com.parameters([in,type=CURRENCY] newValue) */
  public native void setSize(long newValue);


  /** @com.method(dispid=3, name="Bold", type=PROPGET)
      @com.parameters([type=BOOLEAN] return) */
  public native boolean getBold();


  /** @com.method(dispid=3, name="Bold", type=PROPPUT)
      @com.parameters([in,type=BOOLEAN] newValue) */
  public native void setBold(boolean newValue);


  /** @com.method(dispid=4, name="Italic", type=PROPGET)
      @com.parameters([type=BOOLEAN] return) */
  public native boolean getItalic();


  /** @com.method(dispid=4, name="Italic", type=PROPPUT)
      @com.parameters([in,type=BOOLEAN] newValue) */
  public native void setItalic(boolean newValue);


  /** @com.method(dispid=5, name="Underline", type=PROPGET)
      @com.parameters([type=BOOLEAN] return) */
  public native boolean getUnderline();


  /** @com.method(dispid=5, name="Underline", type=PROPPUT)
      @com.parameters([in,type=BOOLEAN] newValue) */
  public native void setUnderline(boolean newValue);


  /** @com.method(dispid=6, name="Strikethrough", type=PROPGET)
      @com.parameters([type=BOOLEAN] return) */
  public native boolean getStrikethrough();


  /** @com.method(dispid=6, name="Strikethrough", type=PROPPUT)
      @com.parameters([in,type=BOOLEAN] newValue) */
  public native void setStrikethrough(boolean newValue);


  /** @com.method(dispid=7, name="Weight", type=PROPGET)
      @com.parameters([type=I2] return) */
  public native short getWeight();


  /** @com.method(dispid=7, name="Weight", type=PROPPUT)
      @com.parameters([in,type=I2] newValue) */
  public native void setWeight(short newValue);


  /** @com.method(dispid=8, name="Charset", type=PROPGET)
      @com.parameters([type=I2] return) */
  public native short getCharset();


  /** @com.method(dispid=8, name="Charset", type=PROPPUT)
      @com.parameters([in,type=I2] newValue) */
  public native void setCharset(short newValue);


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0xbef6e003, (short)0xa874, (short)0x101a, (byte)0x8b, (byte)0xba, (byte)0x0, (byte)0xaa, (byte)0x0, (byte)0x30, (byte)0xc, (byte)0xab);
  // getName UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  /** @com.method()
  //      @hidden */
  //  public native String getName();

  // setName UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  /** @com.method()
  //      @hidden */
  //  public native void setName(String pname);

  // getSize UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  /** @com.method()
  //      @hidden */
  //  public native long getSize();

  // setSize UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  /** @com.method()
  //      @hidden */
  //  public native void setSize(long psize);

  // getBold UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  /** @com.method()
  //      @hidden */
  //  public native boolean getBold();

  // setBold UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  /** @com.method()
  //      @hidden */
  //  public native void setBold(boolean pbold);

  // getItalic UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  /** @com.method()
  //      @hidden */
  //  public native boolean getItalic();

  // setItalic UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  /** @com.method()
  //      @hidden */
  //  public native void setItalic(boolean pitalic);

  // getUnderline UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  /** @com.method()
  //      @hidden */
  //  public native boolean getUnderline();

  // setUnderline UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  /** @com.method()
  //      @hidden */
  //  public native void setUnderline(boolean punderline);

  // getStrikethrough UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  /** @com.method()
  //      @hidden */
  //  public native boolean getStrikethrough();

  // setStrikethrough UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  /** @com.method()
  //      @hidden */
  //  public native void setStrikethrough(boolean pstrikethrough);

  // getWeight UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  /** @com.method()
  //      @hidden */
  //  public native short getWeight();

  // setWeight UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  /** @com.method()
  //      @hidden */
  //  public native void setWeight(short pweight);

  // getCharset UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  /** @com.method()
  //      @hidden */
  //  public native short getCharset();

  // setCharset UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  /** @com.method()
  //      @hidden */
  //  public native void setCharset(short pcharset);

  /** @com.method()
      @hidden */
  public native int getHFont();

  /** @com.method()
      @hidden */
  public native void Clone(stdole2.IFont[] ppfont);

  /** @com.method()
      @hidden */
  public native void IsEqual(stdole2.IFont pfontOther);

  /** @com.method()
      @hidden */
  public native void SetRatio(int cyLogical, int cyHimetric);

  /** @com.method()
      @hidden */
  public native void AddRefHfont(int hFont);

  /** @com.method()
      @hidden */
  public native void ReleaseHfont(int hFont);


  public static final com.ms.com._Guid clsid = new com.ms.com._Guid((int)0xbe35203, (short)0x8f91, (short)0x11ce, (byte)0x9d, (byte)0xe3, (byte)0x0, (byte)0xaa, (byte)0x0, (byte)0x4b, (byte)0xb8, (byte)0x51);
}
