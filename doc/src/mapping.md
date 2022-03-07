# Schema Mapping (Draft)
## Item
AttributeName|Description|Unique Key
-|-|-
id|Generated  ONDC id
company.name| Name of the company| UK2,UK3
descriptor.name|SKU Name|UK3
descriptor.code|UPC/GSTIN|UK1
descriptor.short_desc|Short Description
descriptor.long_desc |Long Description
descriptor.images|Array of urls <br> Url's procotcol could be http(s) or data: 
price.maximum| MRP
price.currency|Currency (INR for indian rupee)
tags.model|e.g Pepsi cola when descriptor.name is Pepsi Cola 200ml, usually it is a substring of descriptor.name|UK2
tags.variant|200 ml , 500ml etc for Pepsi.|UK2
tags.asset_code|Asset Code  of the model that determines the tax  rate. (HSN/SAC Code)
tags.country_of_origin|Country of Origin
tags.key_words|Keywords array associated with the Product
tags.shelf_life_in_days|Shelf Life in Days 
tags.refrigeration_required|Whether the product requires refrigeration
tags.color_of_the_dot|red or green to indicate animal products or plant based product.
tags.gst_pct|Gst Percent derived from asset_code.





Questions:
-
Q. Do  we need to add dimensions , dimension uom, weight and weight uom at Item for using with Logistic providers? 

A. Not required as it is based on cartons shipped and not based on product size.

	
## AssetCode [(HSN/Sac Codes)](https://cbic-gst.gov.in/gst-goods-services-rates.html)
Attribute|Description 
-|-
Code|A numeric code that identifies product category or service's category
Description
TaxRate|0-100 indicates percentage tax applied on the product price.





 

