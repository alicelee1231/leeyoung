package self.com.dao;

import self.com.dto.SampleDTO;

import java.sql.*;
import java.util.ArrayList;


public class SampleDAO {
    public ArrayList<SampleDTO> findAll(){
        //dto저장하는 리스트
        ArrayList<SampleDTO> sampleDTOs = new ArrayList<>();

        //JDBC드라이버 로딩
        try{
            Class.forName("org.postgresql.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        //1.connect to DB
        try(Connection conn = DriverManager.getConnection("jdbc:postgresql:javasample",
                "suapapa", "PasswOrd")){
                    //2.make a select
                    //generate the statement object
            Statement stmt = conn.createStatement();
            ResultSet rset = stmt.executeQuery("SELECT * FROM book");

            //3. save in DTO
            while(rset.next()){
                SampleDTO dto = new SampleDTO();

                dto.setId(rset.getString("id"));
                dto.setName(rset.getString("name"));
                dto.setPrice(rset.getInt("price"));

                //save in list

                sampleDTOs.add(dto);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return sampleDTOs;
    }
}
