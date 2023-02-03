
package project252;
public class CookiesFactory {
    
    public Cookies getCookies(String cookies) { 
        cookies = cookies.toLowerCase();
        if (cookies == null) {
            return null;
        } else if (cookies.contains("sunny day")) {
            if(cookies.contains("extra white")){
              return new SunnyDay(new WhiteChocolate());
            }else if(cookies.contains("extra dark")){
              return new SunnyDay(new DarkChocolate()); 
            }
            return new SunnyDay();
            
        } else if (cookies.contains("pink velvet" )) {
            if(cookies.contains("extra white")){
              return new PinkVelvet(new WhiteChocolate());
            }else if(cookies.contains("extra dark")){
              return new PinkVelvet(new DarkChocolate());
            }
            return new PinkVelvet();
            
        }else if (cookies.contains("chocolate chip")) {
            if(cookies.contains("extra white")){
              return new ChocolateChip(new WhiteChocolate());
            }else if(cookies.contains("extra dark")){
              return new ChocolateChip(new DarkChocolate());
            }
            return new ChocolateChip();
            
        } else if (cookies.contains("birthday cake")) {
            if(cookies.contains("extra white")){
              return new BirthdayCake(new WhiteChocolate());
            }else if(cookies.contains("extra dark")){
              return new BirthdayCake(new DarkChocolate());
            }
            return new BirthdayCake();
        }
        return null;
    }
}
