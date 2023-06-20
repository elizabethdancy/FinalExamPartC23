package ca.sheridancollege.softwarefundamentals.hockeyregistration;

/**
 * A utility class to verify that players on 
 * a hockey team meet certain criteria with respect
 * to their age for an 'under 10' team. Used for final
 * exam review.
 * @author dancye, 2023
 */
public class HockeyRegistrarValidator 
{

    /**
     * A method that validates that players are eligible for '10 and under' meaning they must be born in 2013 or later .
     * @param playerBirthYear, the player's year of birth
     * @return true if the player was born in 2013 or later, false otherwise. 
     */
    public boolean validateBirthYear(int playerBirthYear)
    {
        if(playerBirthYear>=2013)
        {
            return true;
        }
        return false;
    }
    
}
