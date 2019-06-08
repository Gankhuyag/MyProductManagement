package edu.mum.cs.cs425.prodmgmt.repository;

import org.springframework.stereotype.Repository;
import  edu.mum.cs.cs425.prodmgmt.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface productRepository extends JpaRepository<Product,Long>  {

}
