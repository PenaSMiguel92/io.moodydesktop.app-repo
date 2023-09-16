package io.moodydesktop.app;


public class App 
{
    public static void main( String[] args )
    {
        Frame myFrame = new Frame();
        Button myButton = new Button(100, 100, 250, 100);
        myButton.setText("I'm a button. :D");
        myButton.setFocusable(false);
        myFrame.add(myButton);
        //myFrame.add(label);
        //myFrame.pack();

    }
}
