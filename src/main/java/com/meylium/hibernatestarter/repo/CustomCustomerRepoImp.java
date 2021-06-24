package com.meylium.hibernatestarter.repo;

import com.meylium.hibernatestarter.model.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@Repository
public class CustomCustomerRepoImp implements CustomCustomerRepo {
    @PersistenceContext
    private EntityManager em;

    public Customer findByIdc(long id) {
        Query query = em.createQuery("select c from  Customer c where c.id =:id");
        query.setParameter("id", id);
        return (Customer) query.getSingleResult();
    }

    public Customer getCustomerWithTypedQuery(Long id) {
        TypedQuery<Customer> typedQuery = em.createQuery("select c from Customer c where c.id=:id", Customer.class);
        typedQuery.setParameter("id", id);
        return typedQuery.getSingleResult();
    }

    public Customer getCustomerByIdWithCriteriaQuery(Long id) {
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Customer> criteriaQuery = criteriaBuilder.createQuery(Customer.class);
        Root<Customer> userRoot = criteriaQuery.from(Customer.class);
        Customer queryResult = em.createQuery(criteriaQuery.select(userRoot)
                .where(criteriaBuilder.equal(userRoot.get("id"), id)))
                .getSingleResult();
        return queryResult;
    }
}
