/**
 * 
 */
package com.sivalabs.discuzz.core.services;

import com.sivalabs.discuzz.core.entities.User;

/**
 * @author katsi02
 *
 */
public interface UserContext {

	void setCurrentUser(User user);

	User getCurrentUser();

}
