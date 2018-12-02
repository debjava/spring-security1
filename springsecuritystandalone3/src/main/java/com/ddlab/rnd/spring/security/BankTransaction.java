/**
 * 
 */
package com.ddlab.rnd.spring.security;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;

/**
 * @author Debadatta Mishra (Piku)
 *
 */
public interface BankTransaction {
	
//	@PreAuthorize ("hasRole('ROLE_MANAGER') and isFullyAuthenticated()")
//	@PreAuthorize ("isAuthenticated() and hasRole('ROLE_MANAGER')")
//	@PreAuthorize("!isAnonymous() and hasRole('ROLE_MANAGER')")
	@PreAuthorize ("hasRole('ROLE_MANAGER')")
	public void approveLoan(String actNo);
	
	@Secured("ROLE_USER")
	public void openAccount(String customerName);
	
//	@PreAuthorize ("hasRole('ROLE_ADMIN')")
	@PreAuthorize ("hasRole('ROLE_MANAGER')")
	public void resetNetBankingPassword(String customerName);
	
//	@PreAuthorize ("hasAnyRole('ROLE_MANAGER,ROLE_TELLER')")
	@PreAuthorize ("hasRole('ROLE_TELLER')")
	public void checkAccountStatus(String actNo);
	
	@Secured({"ROLE_ADMIN", "ROLE_MANAGER" , "ROLE_TELLER"})
	public void suggestCreditCard(String customerName);
	
	/**
	 * Can be approved only by Manager and not by any other persons
	 */
	@Secured({"ROLE_MANAGER"})
	public void approveOverDraftFacility(String customerName);

}
