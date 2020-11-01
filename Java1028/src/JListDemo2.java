import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JListDemo2 {
    JFrame frame = new JFrame("JList Demo 2");
    JList dataList;


    JPanel panel = new JPanel();
    JRadioButton rb1,rb2,rb3;
    JTextArea ta = new JTextArea(3,40);

    public static void main(String[] args) {
        JListDemo2 ld2 = new JListDemo2();
        ld2.go();
    }

    private void go() {
        String[] data =
                {"Monday","Tuesday","Wednesday","Tuesday","Friday","Saturday","Sunday"};
        dataList = new JList(data);

        dataList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Object[] selections = dataList.getSelectedValues();
                String values = "\n";
                for (int i = 0;i<selections.length;i++){
                    values = values+selections[i]+"";
                }
                ta.append(values);
            }
        });
        dataList.addListSelectionListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1){
                    int index = dataList.locationToIndex(e.getPoint());
                    ta.append("\nClicked on Item"+index);
                }
                if (e.getClickCount()==2){
                    int index = dataList.locationToIndex(e.getPoint());
                    ta.append("\nDouble clicked on Item"+index);
                }
            }
        }
    }
}
