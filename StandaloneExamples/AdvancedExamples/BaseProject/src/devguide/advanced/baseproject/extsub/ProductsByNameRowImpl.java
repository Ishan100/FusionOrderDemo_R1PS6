package devguide.advanced.baseproject.extsub;

import devguide.advanced.baseproject.extsub.common.ProductsByNameRow;

import oracle.jbo.server.AttributeDefImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ProductsByNameRowImpl extends ProductsRowImpl implements ProductsByNameRow {

    public static final int MAXATTRCONST = oracle.jbo.server.ViewDefImpl.getMaxAttrConst("devguide.advanced.baseproject.extsub.Products");
    public static final int SOMEEXTRAATTR = MAXATTRCONST;

    /**This is the default constructor (do not remove).
     */
    public ProductsByNameRowImpl() {
    }
    
    public void someExtraFeature(String x) {
      System.out.println("## Called someExtraFeature of ProductsByNameRowImpl");
    }

    /**Gets ProductsBase entity object.
     */
    public ProductsBaseImpl getProductsBase() {
        return (ProductsBaseImpl)getEntity(0);
    }

    /**getAttrInvokeAccessor: generated method. Do not modify.
     */
    protected Object getAttrInvokeAccessor(int index, 
                                           AttributeDefImpl attrDef) throws Exception {
        if (index == SOMEEXTRAATTR) {
            return getSomeExtraAttr();
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**setAttrInvokeAccessor: generated method. Do not modify.
     */
    protected void setAttrInvokeAccessor(int index, Object value, 
                                         AttributeDefImpl attrDef) throws Exception {
        super.setAttrInvokeAccessor(index, value, attrDef);
        return;
    }

    /**Gets the attribute value for the calculated attribute SomeExtraAttr.
     */
    public String getSomeExtraAttr() {
        return (String) getAttributeInternal(SOMEEXTRAATTR);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute SomeExtraAttr.
     */
    public void setSomeExtraAttr(String value) {
        setAttributeInternal(SOMEEXTRAATTR, value);
    }
}
