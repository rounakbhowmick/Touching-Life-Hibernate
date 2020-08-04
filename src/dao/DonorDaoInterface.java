package dao;

import java.util.List;

import model.Donor;

public interface DonorDaoInterface {
	int signup(Donor donor);
	boolean loginDonor(Donor donor);
	/*************** Displaying donor's personal data ***************/
	List<Donor> view(String email);
}
