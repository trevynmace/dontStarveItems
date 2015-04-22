package workbench;

import java.awt.FlowLayout;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ItemFrame
{
    JFrame frame;
    JPanel panel;
    JButton runScriptButton;
    List<Item> listOfItems;
    List<JButton> listOfButtons = new ArrayList<JButton>();
    JTextField amountField = new JTextField();
    Robot robot = null;

    public ItemFrame()
    {
        frame = new JFrame();
        panel = new JPanel();

        setUpFrameAndPanel();
    }

    public void init()
    {
        setUpFrameAndPanel();
        addToList();
        createButtons();
        addButtonsToPanel();
        amountField.setText("1");
        panel.add(amountField);
        panel.setVisible(true);
        frame.setVisible(true);
    }

    public void setUpFrameAndPanel()
    {
        frame.setLocation(300, 100);
        frame.setSize(200, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //        frame.setAlwaysOnTop(true);
        frame.add(panel);
        panel.setLayout(new FlowLayout());
    }

    private void addButtonsToPanel()
    {
        for (JButton button : listOfButtons)
        {
            panel.add(button);
        }
        panel.revalidate();
    }

    private void addToList()
    {
        listOfItems = new ArrayList<Item>();
        //TODO: needs to add all items (or just needed ones for now)
        List<Integer> spidergland = new ArrayList<Integer>();
        spidergland.add(KeyEvent.VK_S);
        spidergland.add(KeyEvent.VK_P);
        spidergland.add(KeyEvent.VK_I);
        spidergland.add(KeyEvent.VK_D);
        spidergland.add(KeyEvent.VK_E);
        spidergland.add(KeyEvent.VK_R);
        spidergland.add(KeyEvent.VK_G);
        spidergland.add(KeyEvent.VK_L);
        spidergland.add(KeyEvent.VK_A);
        spidergland.add(KeyEvent.VK_N);
        spidergland.add(KeyEvent.VK_D);
        listOfItems.add(new Item("Spider Gland", spidergland, new ImageIcon()));
    }

    private void createButtons()
    {
        runScriptButton = new JButton("Run Script");
        runScriptButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (robot == null)
                {
                    try
                    {
                        robot = new Robot();
                    }
                    catch (Exception ex)
                    {
                        ex.printStackTrace();
                    }
                }

                if (robot != null)
                {
                    //RunScript("consolecommands")
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_TAB);
                    robot.keyRelease(KeyEvent.VK_TAB);
                    robot.keyRelease(KeyEvent.VK_ALT);

                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_BACK_QUOTE);
                    robot.keyRelease(KeyEvent.VK_BACK_QUOTE);
                    robot.keyRelease(KeyEvent.VK_SHIFT);

                    delay(1000);

                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_R);
                    robot.keyRelease(KeyEvent.VK_R);
                    robot.keyRelease(KeyEvent.VK_SHIFT);

                    robot.keyPress(KeyEvent.VK_U);
                    robot.keyRelease(KeyEvent.VK_U);

                    robot.keyPress(KeyEvent.VK_N);
                    robot.keyRelease(KeyEvent.VK_N);

                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_S);
                    robot.keyRelease(KeyEvent.VK_S);
                    robot.keyRelease(KeyEvent.VK_SHIFT);

                    robot.keyPress(KeyEvent.VK_C);
                    robot.keyRelease(KeyEvent.VK_C);

                    robot.keyPress(KeyEvent.VK_R);
                    robot.keyRelease(KeyEvent.VK_R);

                    robot.keyPress(KeyEvent.VK_I);
                    robot.keyRelease(KeyEvent.VK_I);

                    robot.keyPress(KeyEvent.VK_P);
                    robot.keyRelease(KeyEvent.VK_P);

                    robot.keyPress(KeyEvent.VK_T);
                    robot.keyRelease(KeyEvent.VK_T);

                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_9);
                    robot.keyRelease(KeyEvent.VK_9);
                    robot.keyRelease(KeyEvent.VK_SHIFT);

                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_QUOTE);
                    robot.keyRelease(KeyEvent.VK_QUOTE);
                    robot.keyRelease(KeyEvent.VK_SHIFT);

                    robot.keyPress(KeyEvent.VK_C);
                    robot.keyRelease(KeyEvent.VK_C);

                    robot.keyPress(KeyEvent.VK_O);
                    robot.keyRelease(KeyEvent.VK_O);

                    robot.keyPress(KeyEvent.VK_N);
                    robot.keyRelease(KeyEvent.VK_N);

                    robot.keyPress(KeyEvent.VK_S);
                    robot.keyRelease(KeyEvent.VK_S);

                    robot.keyPress(KeyEvent.VK_O);
                    robot.keyRelease(KeyEvent.VK_O);

                    robot.keyPress(KeyEvent.VK_L);
                    robot.keyRelease(KeyEvent.VK_L);

                    robot.keyPress(KeyEvent.VK_E);
                    robot.keyRelease(KeyEvent.VK_E);

                    robot.keyPress(KeyEvent.VK_C);
                    robot.keyRelease(KeyEvent.VK_C);

                    robot.keyPress(KeyEvent.VK_O);
                    robot.keyRelease(KeyEvent.VK_O);

                    robot.keyPress(KeyEvent.VK_M);
                    robot.keyRelease(KeyEvent.VK_M);

                    robot.keyPress(KeyEvent.VK_M);
                    robot.keyRelease(KeyEvent.VK_M);

                    robot.keyPress(KeyEvent.VK_A);
                    robot.keyRelease(KeyEvent.VK_A);

                    robot.keyPress(KeyEvent.VK_N);
                    robot.keyRelease(KeyEvent.VK_N);

                    robot.keyPress(KeyEvent.VK_D);
                    robot.keyRelease(KeyEvent.VK_D);

                    robot.keyPress(KeyEvent.VK_S);
                    robot.keyRelease(KeyEvent.VK_S);

                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_QUOTE);
                    robot.keyRelease(KeyEvent.VK_QUOTE);
                    robot.keyRelease(KeyEvent.VK_SHIFT);

                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_0);
                    robot.keyRelease(KeyEvent.VK_0);
                    robot.keyRelease(KeyEvent.VK_SHIFT);

                    robot.keyPress(KeyEvent.VK_ENTER);
                    robot.keyRelease(KeyEvent.VK_ENTER);
                }
            }
        });
        listOfButtons.add(runScriptButton);

        for (Item item : listOfItems)
        {
            JButton button = new JButton(item.getName());
            //            button.setIcon(item.getImage());
            button.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    if (robot == null)
                    {
                        try
                        {
                            robot = new Robot();
                        }
                        catch (Exception ex)
                        {
                            ex.printStackTrace();
                        }
                    }

                    if (robot != null)
                    {
                        robot.keyPress(KeyEvent.VK_ALT);
                        robot.keyPress(KeyEvent.VK_TAB);
                        robot.keyRelease(KeyEvent.VK_TAB);
                        robot.keyRelease(KeyEvent.VK_ALT);

                        delay(1000);

                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
                        robot.keyRelease(KeyEvent.VK_BACK_QUOTE);
                        robot.keyRelease(KeyEvent.VK_SHIFT);

                        delay(1000);

                        robot.keyPress(KeyEvent.VK_C);
                        robot.keyRelease(KeyEvent.VK_C);

                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_MINUS);
                        robot.keyRelease(KeyEvent.VK_MINUS);
                        robot.keyRelease(KeyEvent.VK_SHIFT);

                        robot.keyPress(KeyEvent.VK_G);
                        robot.keyRelease(KeyEvent.VK_G);
                        robot.keyPress(KeyEvent.VK_I);
                        robot.keyRelease(KeyEvent.VK_I);
                        robot.keyPress(KeyEvent.VK_V);
                        robot.keyRelease(KeyEvent.VK_V);
                        robot.keyPress(KeyEvent.VK_E);
                        robot.keyRelease(KeyEvent.VK_E);

                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_9);
                        robot.keyRelease(KeyEvent.VK_9);
                        robot.keyRelease(KeyEvent.VK_SHIFT);

                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_QUOTE);
                        robot.keyRelease(KeyEvent.VK_QUOTE);
                        robot.keyRelease(KeyEvent.VK_SHIFT);

                        for (int i : item.getId())
                        {
                            robot.keyPress(i);
                            robot.keyRelease(i);
                        }

                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_QUOTE);
                        robot.keyRelease(KeyEvent.VK_QUOTE);
                        robot.keyRelease(KeyEvent.VK_SHIFT);

                        robot.keyPress(KeyEvent.VK_COMMA);
                        robot.keyRelease(KeyEvent.VK_COMMA);

                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_QUOTE);
                        robot.keyRelease(KeyEvent.VK_QUOTE);
                        robot.keyRelease(KeyEvent.VK_SHIFT);

                        //TODO: implement a text box with the amount of each item to give
                        int amountEvent = getEventFromAmountField();

                        robot.keyPress(amountEvent);
                        robot.keyRelease(amountEvent);

                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_QUOTE);
                        robot.keyRelease(KeyEvent.VK_QUOTE);
                        robot.keyRelease(KeyEvent.VK_SHIFT);

                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_0);
                        robot.keyRelease(KeyEvent.VK_0);
                        robot.keyRelease(KeyEvent.VK_SHIFT);

                        robot.keyPress(KeyEvent.VK_ENTER);
                        robot.keyRelease(KeyEvent.VK_ENTER);
                    }
                }
            });
            listOfButtons.add(button);
        }
    }

    protected int getEventFromAmountField()
    {
        int amount = Integer.parseInt(amountField.getText());

        switch (amount)
        {
        case 1:
            return KeyEvent.VK_1;
        case 2:
            return KeyEvent.VK_2;
        case 3:
            return KeyEvent.VK_3;
        case 4:
            return KeyEvent.VK_4;
        case 5:
            return KeyEvent.VK_5;
        case 6:
            return KeyEvent.VK_6;
        case 7:
            return KeyEvent.VK_7;
        case 8:
            return KeyEvent.VK_8;
        case 9:
            return KeyEvent.VK_9;
        default:
            return KeyEvent.VK_1;
        }
    }

    void delay()
    {
        robot.delay(20);
    }

    void delay(int time)
    {
        robot.delay(time);
    }
}