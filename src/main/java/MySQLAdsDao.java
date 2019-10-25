import com.mysql.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    Connection connection;

    public MySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUsername(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    //displays ads
    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            // takes resultset datatype has the query string
            ResultSet rs = statement.executeQuery("SELECT  * FROM ads");
            // this loop will loop through all the things you past threw
            while (rs.next()){
//                translate the Resultset into an List<Ad>
                Ad ad = new Ad(rs.getLong("id"),
                        rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description"));
//                Add the new Ad into the List<Ad>
                ads.add(ad);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return ads; // returns the ads array list
    }

    @Override
    public Long insert(Ad ad) {
        try {
            Statement stmt = connection.createStatement();

            String sql = String.format("insert into ads(title, description) values('%s','%s')",ad.getTitle(),ad.getDescription());
            stmt.executeLargeUpdate(sql,Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0L;

    }
}
