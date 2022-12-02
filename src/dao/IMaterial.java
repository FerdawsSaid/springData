package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.enig.model.Material;
@Repository
public interface IMaterial extends JpaRepository<Material, Integer> {

}
