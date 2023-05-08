package com.companydatabase.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.companydatabase.entity.Company;
import com.companydatabase.entity.Users;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

	List<Company> findAll();
//	List<Users> findByCompanyId(Long companyId);
//	Optional<Company> findById(Long id);
	Company findByCompanyName(String companyName);
}
