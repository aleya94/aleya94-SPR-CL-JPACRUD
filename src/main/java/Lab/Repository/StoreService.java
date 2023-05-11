package Lab.Repository;

import Lab.Model.Store;
import Lab.Service.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StoreService {
    StoreRepository storeRepository;
    @Autowired
    public StoreService(StoreRepository storeRepository){
        this.storeRepository = storeRepository;
    }
    /**
     * TODO: given a transient store, persist the store and return it.
     * @param store a transient store
     * @return the persisted store
     */
    public Store persistStore(Store store){
        return null;
    }
    /**
     * TODO: get all store entities
     * @return all store entities
     */
    public List<Store> getAllStores(){
        return null;
    }
    /**
     * TODO: given an id of a store, return the store.
     * @return a store entity
     * @param id id of store entity
     */
    public List<Store> getStoreById(long id){
        return null;
    }
    /**
     * TODO: given an id of an existing store, delete the store
     */
    public void deleteStore(long id){
//        code here
    }
    /**
     * TODO: given an id and some replacement data for a store, overwrite the data of an existing store,
     * and return the updated store.
     * @return the updated store entity
     */
    public Store updateStore(long id, Store replacement){
        return null;
    }

}
