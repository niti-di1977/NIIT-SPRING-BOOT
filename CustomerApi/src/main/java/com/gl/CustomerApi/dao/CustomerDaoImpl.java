//package com.gl.CustomerApi.dao;
//
//import java.util.List;
//
//import org.springframework.stereotype.Repository;
//
//import com.gl.CustomerApi.entities.CustomerEntity;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
//import jakarta.transaction.Transactional;
//
//@Repository
//@Transactional
//public class CustomerDaoImpl implements CustomerDao {
//
//	@PersistenceContext
//	private EntityManager entityManager;
//	
//	@Override
//	public CustomerEntity addCust(CustomerEntity cust) {
//		
//		entityManager.persist(cust);
//		
//		return cust;
//	}
//
//	@Override
//	public CustomerEntity getCust(int customerId) {
//		
//		return entityManager.find(CustomerEntity.class, customerId);
//	}
//
//	@Override
//	public CustomerEntity updateCust(CustomerEntity cust) {
//		CustomerEntity custEntity=	entityManager.find(CustomerEntity.class, cust.getCustomerId());
//		custEntity.setEmailId(cust.getEmailId());
//		custEntity.setName(cust.getName());		
//		return cust;
//	}
//
//	@Override
//	public String deleteCust(int customerId) {
//		CustomerEntity custEntity=	entityManager.find(CustomerEntity.class, customerId);	
//		entityManager.remove(custEntity.getCustomerId());		
//		return null;
//	}
//
//	@Override
//	public List<CustomerEntity> getCusts() {
//		
//		return null;
//		}
//
//}
