package SartenMango_3.interfaces;

import SartenMango_3.modelo.Cookware;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InterfaceCookware extends MongoRepository <Cookware, String>{
}
