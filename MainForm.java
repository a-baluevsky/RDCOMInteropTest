import com.ms.wfc.app.*;
import com.ms.wfc.core.*;
import com.ms.wfc.ui.*;
import com.ms.wfc.html.*;

import scrrun.FileSystemObject;

import refaldriver.RefalDriverEngine;
import refaldriver._RefalDriverEngine;
import refaldriver._RefalDriverOptions;

/**
 * This class can take a variable number of parameters on the command
 * line. Program execution begins with the main() method. The class
 * constructor is not invoked unless an object of type 'Form1' is
 * created in the main() method.
 */
public class MainForm extends Form
{
    private _RefalDriverEngine rf = new RefalDriverEngine();
    
	public MainForm() throws Exception
	{
		// Required for Visual J++ Form Designer support
		initForm();		
        
        FileSystemObject fso = new FileSystemObject();
        String sPathRslCalcSvr = "C:\\Projects\\JRefalDriver\\RDCOMInteropTest\\CalcSvr.rsl";
        if(!fso.FileExists(sPathRslCalcSvr))
            sPathRslCalcSvr = fso.BuildPath(Application.getStartupPath(), "CalcSvr.rsl");
        if(fso.FileExists(sPathRslCalcSvr)) {            
            _RefalDriverOptions rfOpts = rf.getDriverOptions();
            rfOpts.setRefalVersion("5");
            //rfOpts.setRefalPath("%REFALPATH%");
            rfOpts.setRefalPath("C:\\Refal5");
            rf.getModules().AddFromRslFile(new String[]{"Main"}, 
                                           new String[]{sPathRslCalcSvr},
                                           true);
        } else {
            throw new Exception("Calculation Server RSL file not found: "+
                                sPathRslCalcSvr);
        }
                                           
	}

	/**
	 * Form1 overrides dispose so it can clean up the
	 * component list.
	 */
	public void dispose()
	{
		super.dispose();
		components.dispose();
	}

    private void java_Add_click(Object source, Event e)
    {        
        int r = Integer.parseInt(edit1.getText())+
                Integer.parseInt(edit2.getText());            
        edit3.setText(String.valueOf(r));     
    }

    private void java_Sub_click(Object source, Event e)
    {
        int r = Integer.parseInt(edit1.getText())-
                Integer.parseInt(edit2.getText());            
        edit3.setText(String.valueOf(r));
    }

    private void java_Mul_click(Object source, Event e)
    {
        int r = Integer.parseInt(edit1.getText())*
                Integer.parseInt(edit2.getText());            
        edit3.setText(String.valueOf(r));          
    }

    private void java_Div_click(Object source, Event e)
    {
        int r = Integer.parseInt(edit1.getText())/
                Integer.parseInt(edit2.getText());            
        edit3.setText(String.valueOf(r));          
    }
    private String refalCalcServer(String op, String i1, String i2) /*throws Exception*/ {
        String[] in = {i1+op+i2 };
        String r="";
        String[] out = new String[]{r};
        try{
            int iResult = rf.Run(new String[]{"Main"}, new String[]{""}, in, out);
            r=out[0];
            if(r.endsWith(" \r\n"))
               r=r.substring(0,r.length()-3); 
        } catch(Exception e) {
            r = "ERROR!";
            MessageBox.show(e.getMessage(), 
                            "Failed running Refal Calc Server",
                            MessageBox.ICONEXCLAMATION);            
        }
        return r;
    }
    private void buttonAdd_click(Object source, Event e) 
    { 
        edit3.setText(refalCalcServer("+", edit1.getText(), edit2.getText()));        
    }

    private void buttonSub_click(Object source, Event e)
    {
        edit3.setText(refalCalcServer("-", edit1.getText(), edit2.getText())); 
    }

    private void buttonMul_click(Object source, Event e)
    {
        edit3.setText(refalCalcServer("*", edit1.getText(), edit2.getText())); 
    }

    private void buttonDiv_click(Object source, Event e)
    {
        edit3.setText(refalCalcServer("/", edit1.getText(), edit2.getText())); 
    }

    /**
     * NOTE: The following code is required by the Visual J++ form
     * designer.  It can be modified using the form editor.  Do not
     * modify it using the code editor.
     */
    Container components = new Container();
    Edit edit1 = new Edit();
    Edit edit2 = new Edit();
    Edit edit3 = new Edit();
    Button buttonAdd = new Button();
    Button buttonSub = new Button();
    Button buttonMul = new Button();
    Button buttonDiv = new Button();

    private void initForm()
    {
        this.setText("RefalDriver Test");
        this.setAutoScaleBaseSize(new Point(5, 13));
        this.setBorderStyle(FormBorderStyle.FIXED_SINGLE);
        this.setClientSize(new Point(294, 225));
        this.setMaximizeBox(false);
        this.setMinimizeBox(false);

        edit1.setFont(new Font("Vrinda", 22.0f, FontSize.POINTS, FontWeight.BOLD, false, false, false, CharacterSet.DEFAULT, 0));
        edit1.setForeColor(new Color(128, 128, 255));
        edit1.setLocation(new Point(16, 24));
        edit1.setSize(new Point(264, 37));
        edit1.setTabIndex(2);
        edit1.setText("0");
        edit1.setBorderStyle(BorderStyle.FIXED_SINGLE);
        edit1.setTextAlign(HorizontalAlignment.RIGHT);

        edit2.setFont(new Font("Vrinda", 22.0f, FontSize.POINTS, FontWeight.BOLD, false, false, false, CharacterSet.DEFAULT, 0));
        edit2.setForeColor(new Color(128, 128, 255));
        edit2.setLocation(new Point(16, 80));
        edit2.setSize(new Point(264, 37));
        edit2.setTabIndex(1);
        edit2.setText("0");
        edit2.setBorderStyle(BorderStyle.FIXED_SINGLE);
        edit2.setTextAlign(HorizontalAlignment.RIGHT);

        edit3.setFont(new Font("Vrinda", 22.0f, FontSize.POINTS, FontWeight.BOLD, false, false, false, CharacterSet.DEFAULT, 0));
        edit3.setForeColor(new Color(128, 128, 255));
        edit3.setLocation(new Point(16, 168));
        edit3.setSize(new Point(264, 37));
        edit3.setTabIndex(0);
        edit3.setText("0");
        edit3.setBorderStyle(BorderStyle.FIXED_SINGLE);
        edit3.setTextAlign(HorizontalAlignment.RIGHT);

        buttonAdd.setFont(new Font("Microsoft Sans Serif", 16.0f, FontSize.POINTS, FontWeight.NORMAL, false, false, false, CharacterSet.RUSSIAN, 0));
        buttonAdd.setLocation(new Point(64, 128));
        buttonAdd.setSize(new Point(40, 32));
        buttonAdd.setTabIndex(6);
        buttonAdd.setText("+");
        buttonAdd.addOnClick(new EventHandler(this.buttonAdd_click));

        buttonSub.setFont(new Font("Microsoft Sans Serif", 16.0f, FontSize.POINTS, FontWeight.NORMAL, false, false, false, CharacterSet.RUSSIAN, 0));
        buttonSub.setLocation(new Point(112, 128));
        buttonSub.setSize(new Point(40, 32));
        buttonSub.setTabIndex(5);
        buttonSub.setText("-");
        buttonSub.addOnClick(new EventHandler(this.buttonSub_click));

        buttonMul.setFont(new Font("Microsoft Sans Serif", 16.0f, FontSize.POINTS, FontWeight.NORMAL, false, false, false, CharacterSet.RUSSIAN, 0));
        buttonMul.setLocation(new Point(160, 128));
        buttonMul.setSize(new Point(40, 32));
        buttonMul.setTabIndex(4);
        buttonMul.setText("*");
        buttonMul.addOnClick(new EventHandler(this.buttonMul_click));

        buttonDiv.setFont(new Font("Microsoft Sans Serif", 16.0f, FontSize.POINTS, FontWeight.NORMAL, false, false, false, CharacterSet.RUSSIAN, 0));
        buttonDiv.setLocation(new Point(208, 128));
        buttonDiv.setSize(new Point(40, 32));
        buttonDiv.setTabIndex(3);
        buttonDiv.setText("/");
        buttonDiv.addOnClick(new EventHandler(this.buttonDiv_click));

        this.setNewControls(new Control[] {
                            buttonDiv, 
                            buttonMul, 
                            buttonSub, 
                            buttonAdd, 
                            edit3, 
                            edit2, 
                            edit1});
    }

	/**
	 * The main entry point for the application. 
	 *
	 * @param args Array of parameters passed to the application
	 * via the command line.
	 */
	public static void main(String args[])
	{
        try {
		    Application.run(new MainForm());
        } catch(Exception e) {
            MessageBox.show(e.toString(), "Error!", MessageBox.ICONHAND);
        }
	}
}
