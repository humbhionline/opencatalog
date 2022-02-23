# Schema Mapping (Draft)
## Item
AttributeName|Description|Unique Key
-|-|-
id|Generated  ONDC id
price.maximum| MRP
price.currency|Currency (INR for indian rupee)
descriptor.name|Product Name|UK3
descriptor.code|UPC/GSTIN|UK1
descriptor.short_desc|Short Description
descriptor.long_desc |Long Description
descriptor.images|Array of urls <br> Url's procotcol could be http(s) or data: 
tags.brand|Brand name|UK2,UK3
tags.model|e.g Pepsi cola when descriptor.name is Pepsi Cola 200ml, usually it is a substring of descriptor.name|UK2
tags.variant|200 ml , 500ml etc for Pepsi.|UK2
tags.hsn_code|HSN Code  of the model that determines the tax  rate.
tags.country_of_origin|Country of Origin

Questions:
-
1. Do  we need to add dimensions , dimension uom, weight and weight uom at Item for using with Logistic providers? 

	
## AssetCode [(HSN/Sac Codes)](https://cbic-gst.gov.in/gst-goods-services-rates.html)
Attribute|Description 
-|-
Code|A numeric code that identifies product category or service's category
Description
TaxRate|0-100 indicates percentage tax applied on the product price.





 

