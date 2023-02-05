
package project252;
public class CookiesFactory {
    //returns the cookies choosen bey paaing the type as string 
    /*
    in this method we check the customer's order to return the type requested 
    first we check if the request is null if so return null
    if the string is not null we check the type of the cookie using contains to check if the request contains that type of cookie 
    when we find the type of the cookie we check if the request contains adding extra then return the cookie chosen
    */
    public static Cookie getCookies(String cookies) { 
        
        cookies = cookies.toLowerCase();//make the request insensative 
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
