package org.framework.git.bank.service;

import org.framework.git.bank.document.Business;
import org.framework.git.bank.repository.BusinessRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BusinessService implements GenericInterfaceService<Business> {

    private final BusinessRepository businessRepository;

    public BusinessService(BusinessRepository businessRepository) {
        this.businessRepository = businessRepository;
    }

    @Override
    public List<Business> findAll() {
        return businessRepository.findAll();
    }

    @Override
    public Optional<Business> findById(String id) {
        return businessRepository.findById(id);
    }

    @Override
    public Business save(Business business) {
        return businessRepository.save(business);
    }

    @Override
    public Business update(Business business) {
        return businessRepository.save(business);
    }

    @Override
    public void delete(String id) {
        businessRepository.deleteById(id);
    }

}
