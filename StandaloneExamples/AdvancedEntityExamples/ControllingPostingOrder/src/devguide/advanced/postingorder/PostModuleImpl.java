package devguide.advanced.postingorder;

import devguide.advanced.postingorder.common.PostModule;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.ViewLinkImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PostModuleImpl extends ApplicationModuleImpl implements PostModule {
    /**This is the default constructor (do not remove).
     */
    public PostModuleImpl() {
    }

    public Result newProductForNewSupplier(String supplierName, 
                                           String supplierStatus,
                                           String productName,
                                           String productStatus,
                                           Number listPrice,
                                           Number minPrice,
                                           String shipCode) {
        oracle.jbo.domain.Date today = new Date(Date.getCurrentDate());
        Number objectId = new Number(0);
        // 1. Create a new product
        ProductsBaseImpl newProduct = createNewProduct();
        // 2. Create a new supplier
        SuppliersImpl newSupplier = createNewSupplier();
        newSupplier.setSupplierName(supplierName);
        newSupplier.setSupplierStatus(supplierStatus);
        newSupplier.setCreatedBy("PostingModule");
        newSupplier.setCreationDate(today);
        newSupplier.setLastUpdatedBy("PostingModule");
        newSupplier.setLastUpdateDate(today);
        newSupplier.setObjectVersionId(objectId);
        // 3. Set the supplier id to which the product pertains
        newProduct.setSupplierId(newSupplier.getSupplierId().getSequenceNumber());
        newProduct.setProductName(productName);
        newProduct.setProductStatus(productStatus);
        newProduct.setListPrice(listPrice);
        newProduct.setMinPrice(minPrice);
        newProduct.setShippingClassCode(shipCode);
        newProduct.setCreatedBy("PostingModule");
        newProduct.setCreationDate(today);
        newProduct.setLastUpdatedBy("PostingModule");
        newProduct.setLastUpdateDate(today);
        newProduct.setObjectVersionId(objectId);
        // 4. Commit the transaction
        getDBTransaction().commit();
        // 5. Construct a bean to hold new supplier id and product id
        Result result = new Result();
        result.setProductId(newProduct.getProductId().getSequenceNumber());
        result.setSupplierId(newSupplier.getSupplierId().getSequenceNumber());
        // 6. Return the result
        return result;
    }

    private ProductsBaseImpl createNewProduct(){
        EntityDefImpl productDef = ProductsBaseImpl.getDefinitionObject();
        return (ProductsBaseImpl) productDef.createInstance2(getDBTransaction(), null);
    }
    
    private SuppliersImpl createNewSupplier(){
        EntityDefImpl supplierDef = SuppliersImpl.getDefinitionObject();
        return (SuppliersImpl) supplierDef.createInstance2(getDBTransaction(), null);
        
    }
}