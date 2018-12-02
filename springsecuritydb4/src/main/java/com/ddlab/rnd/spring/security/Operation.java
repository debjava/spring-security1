/**
 * 
 */
package com.ddlab.rnd.spring.security;

import org.springframework.security.access.annotation.Secured;

/**
 * @author Debadatta Mishra (Piku)
 *
 */
public interface Operation {
	
//	@PreAuthorize ("hasRole('APP_ADMIN')")
//	@Secured({"APP_WH_USER"})
//	@Secured({"APP_USER"})
//	@PreAuthorize ("hasRole('APP_ADMIN')")
	//This method can only be executed by USER only
	@Secured({"APP_USER"})
	public void execute();

}
