-- Create the Indexes used

CREATE INDEX INDEX_ORDER_ITEMS_PRODID ON ORDER_ITEMS(PRODUCT_ID); 

CREATE INDEX INDEX_ORDER_ITEMS_ORDID_PRODID ON ORDER_ITEMS(ORDER_ID, PRODUCT_ID); 