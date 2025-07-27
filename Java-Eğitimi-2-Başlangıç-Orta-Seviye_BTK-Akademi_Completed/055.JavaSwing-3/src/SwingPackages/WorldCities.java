package SwingPackages;

import java.util.ArrayList;
import java.sql.*;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class WorldCities extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(WorldCities.class.getName());

    DefaultTableModel model;
        
    public WorldCities() {
        initComponents();
        veriCek();
    }
    
    public void veriCek()
    {
        model = (DefaultTableModel)tblCities.getModel();        
        model.setRowCount(0);
        try 
        {
            ArrayList<City> cities = getCities();
            for (City city : cities)
            {
                Object[] row = 
                {
                        city.getId(),
                        city.getName(),
                        city.getCountryCode(),
                        city.getDistrict(),
                        city.getPopulation() 
                };
                model.addRow(row);
            }            
        } 
        catch (SQLException ex)
        {
            System.out.println("Hata: " + ex);
        }      
    }
    
    
    public ArrayList<City> getCities() throws SQLException
    {
        Connection connection = null;
        DBHelper dBHelper = new DBHelper();
        Statement statement = null;
        ResultSet resultSet;
        ArrayList<City> cities = null;
        try 
        {
            connection = dBHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from city");
            cities = new ArrayList<City>();
            while (resultSet.next())
            {
                cities.add(
                           new City(
                                    resultSet.getInt("ID"),
                                    resultSet.getString("Name"),
                                    resultSet.getString("CountryCode"),
                                    resultSet.getString("District"),
                                    resultSet.getInt("Population")
                           ));                
            }            
        } 
        catch (SQLException e) 
        {
            dBHelper.showErrorMessage(e);
        }
        finally
        {
            statement.close();
            connection.close();
        }
        
        return cities;        
    }
           
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCities = new javax.swing.JTable();
        textArama = new javax.swing.JTextField();
        lblBilgi = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblDistrict = new javax.swing.JLabel();
        lblCountryCode1 = new javax.swing.JLabel();
        lblPopulation = new javax.swing.JLabel();
        textName = new javax.swing.JTextField();
        textCountryCode = new javax.swing.JTextField();
        textDistrict = new javax.swing.JTextField();
        textPopulation = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblCities.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "CountryCode", "District", "Population"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCities);
        if (tblCities.getColumnModel().getColumnCount() > 0) {
            tblCities.getColumnModel().getColumn(0).setResizable(false);
            tblCities.getColumnModel().getColumn(1).setResizable(false);
            tblCities.getColumnModel().getColumn(2).setResizable(false);
            tblCities.getColumnModel().getColumn(3).setResizable(false);
            tblCities.getColumnModel().getColumn(4).setResizable(false);
        }

        textArama.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        textArama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textAramaKeyReleased(evt);
            }
        });

        lblBilgi.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblBilgi.setText("Aranacak Şehir : ");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Name : ");

        lblDistrict.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDistrict.setText("District : ");

        lblCountryCode1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCountryCode1.setText("Country Code : ");

        lblPopulation.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPopulation.setText("Population : ");

        textName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        textCountryCode.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        textDistrict.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        textPopulation.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnAdd.setText("Ekle");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblBilgi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textArama, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCountryCode1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textCountryCode))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDistrict)
                            .addComponent(lblPopulation))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textPopulation, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 402, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textArama, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBilgi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDistrict)
                            .addComponent(textDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCountryCode1)
                            .addComponent(textCountryCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPopulation)
                            .addComponent(textPopulation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textAramaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAramaKeyReleased
        // TODO add your handling code here:
        TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<DefaultTableModel>(model);
        tblCities.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(textArama.getText()));   
    }//GEN-LAST:event_textAramaKeyReleased

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        Connection connection = null;
        DBHelper dBHelper = new DBHelper();
        PreparedStatement statement = null;
        try 
        {
            connection = dBHelper.getConnection();
            String sql = "insert into City (Name,CountryCode,District,Population) values(?,?,?,?)";
            statement = connection.prepareStatement(sql);
            
            statement.setString(1,textName.getText());
            statement.setString(2,textCountryCode.getText());
            statement.setString(3,textDistrict.getText());
            int population = Integer.valueOf(textPopulation.getText());
            statement.setInt(4, population);     
            statement.executeUpdate();
        }
        catch (SQLException e)
        {
            dBHelper.showErrorMessage(e);
        } 
        finally 
        {
            try 
            {
                statement.close();
                connection.close();       
            } 
            catch (SQLException e){}
        }  
        veriCek();
    }//GEN-LAST:event_btnAddActionPerformed
    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new WorldCities().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBilgi;
    private javax.swing.JLabel lblCountryCode1;
    private javax.swing.JLabel lblDistrict;
    private javax.swing.JLabel lblPopulation;
    private javax.swing.JTable tblCities;
    private javax.swing.JTextField textArama;
    private javax.swing.JTextField textCountryCode;
    private javax.swing.JTextField textDistrict;
    private javax.swing.JTextField textName;
    private javax.swing.JTextField textPopulation;
    // End of variables declaration//GEN-END:variables
}
