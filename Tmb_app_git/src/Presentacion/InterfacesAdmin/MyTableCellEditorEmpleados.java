package Presentacion.InterfacesAdmin;

import Servicios.Conexion;
import Servicios.ParqueaderoMes;
import Servicios.SLavadero;
import Servicios.S_Empleados;
import Servicios.S_Hotel;
import java.awt.Component;
import javax.swing.AbstractCellEditor;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellEditor;

/**
 * @web http://blog.jheysonmatta.com.pe/
 * @author Jheyson Matta
 */
public class MyTableCellEditorEmpleados extends AbstractCellEditor implements TableCellEditor {

    private String OldValue = ""; //Valor antiguo de la celda
    private String NewValue = ""; //valor nuevo de la celda
    private String table = ""; // tabla que esta invocando al tableEditor
    private String NameColum = "";//nombre de la columna
    private String ID = "";// Llave del registro
    private JComponent component = new JTextField();

    public MyTableCellEditorEmpleados(String tabla, String NameColumn) {
        this.table = tabla;
        this.NameColum = NameColumn;
    }

    public Object getCellEditorValue() {
        return ((JTextField) component).getText();
    }

    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        OldValue = value.toString();
        ID = table.getValueAt(row, 0).toString();
        ((JTextField) component).setText(value.toString());
        return component;
    }

    @Override
    public boolean stopCellEditing() {
        NewValue = (String) getCellEditorValue();
        if (!NameColum.equalsIgnoreCase("LAVADOR_TELEFONO") && !NameColum.equalsIgnoreCase("RECEPCIONISTA_TELEFONO")) {
            if (!NewValue.equals(OldValue)) {
                NewValue = NewValue.toUpperCase();
                if (!S_Empleados.updateEmpleado(Conexion.obtener(),table, NameColum + "='" + NewValue + "' ", ID)) {   //Si existe algun error al actualizar, escribe viejo valor en la celda
                    JOptionPane.showMessageDialog(null, "Error: No se puede actualizar");
                    ((JTextField) component).setText(OldValue);
                }
            }
        } else if (isNumeric(NewValue)) {
            if (!NewValue.equals(OldValue)) {
                if (!S_Empleados.updateEmpleado(Conexion.obtener(),table, NameColum + "='" + NewValue + "' ", ID)) {   //Si existe algun error al actualizar, escribe viejo valor en la celda
                    JOptionPane.showMessageDialog(null, "Error: No se puede actualizar");
                    ((JTextField) component).setText(OldValue);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Modificacion invalida", "", JOptionPane.ERROR_MESSAGE);
            ((JTextField) component).setText(OldValue);
        }

        return super.stopCellEditing();
    }

    public static boolean isNumeric(String s) {
        try {
            double y = Double.parseDouble(s);
            if (y > -1) {
                return true;
            } else {
                return false;
            }
        } catch (NumberFormatException err) {
            return false;
        }
    }
}
