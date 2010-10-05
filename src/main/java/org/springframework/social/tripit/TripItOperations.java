package org.springframework.social.tripit;

import java.util.List;

import org.springframework.social.core.SocialProviderOperations;

/**
 * Interface specifying a basic set of operations for interacting with TripIt.
 * Implemented by {@link TripItTemplate}. Not often used directly, but a useful
 * option to enhance testability, as it can easily be mocked or stubbed.
 * 
 * Many of the methods contained in this interface require OAuth authentication
 * with TripIt. When a method's description speaks of the "current user", it is
 * referring to the user for whom the access token has been issued.
 * 
 * @author Craig Walls
 */
public interface TripItOperations extends SocialProviderOperations {

	/**
	 * Retrieves the current user's TripIt profile details.
	 * 
	 * @return the user's profile data.
	 */
	TripItProfile getProfile();

	/**
	 * Retrieves a list of upcoming trips for the current user.
	 * 
	 * @return the user's upcoming trips.
	 */
	List<Trip> getTrips();

}