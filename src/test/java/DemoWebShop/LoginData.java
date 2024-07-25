package DemoWebShop;

import org.testng.annotations.DataProvider;

public class LoginData {
    @DataProvider(name = "Logindata")
    public Object[][] loginData(){
        Object[][] data={
                {"ojas1@gmail.com","Ojas@123"},
                {"chandu123@gmail.com","Chandi112233"},
                {"meghana546@outlook.com","meghu*&7"},
                {"pooji@gmail.com","Poo11@123"},
                {"yuvi1476@gmail.com","ImTheKing777"},
                {"MSDhoni07@legend.com","Sakshi&ziva&mahi@2024"}

        };
        return data;
    }
}
