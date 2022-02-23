# Open Catalog Project

## The problem  statement
Several ecommerce platforms have come up in the recent past. By far, the most important requirement for all these platforms is to publish product catalog for their sellers. 


### White labeled Seller Platforms: 
Provide a self serviced catalog management to their sellers. This is usually sufficient as buyers come to the Seller's site to buy and it is in the seller's interest to keep their own catalog meaningful and clean. 

### Market places: 
For Platforms that are market places, the approach of While labeled seller platforms does not work. As the buyers need to relate to products sold on the platform in the same manner across Sellers. To give this experience,  market places , provide a large global catalog within their platform and sellers typically choose from that catalog, products, they are selling on the platform. This ensures that buyers who come to a marketplace see products in a consistent manner across sellers on the platforms.  Adding new products usually requires platforms to come up with professional images, descriptions and other catalog attributes etc and publish them before sellers can use. 

### The ondc dimension 
With open networks like ONDC (Open network for digital commerce), coming into play, There is now a need to have consistent product characteristics across all seller platforms. The natural choice is to have a catalog at the network level which would be used by all participants to cross reference products being traded in the network. 



## The insight!

1. It is in the interest of the Brand owners that their brands are correctly represented with right images, descriptions, product information, etc. by all parties in their supply chain. 
2. Brand owners have all the information needed for a catalog like UPC, GTIN, hsncode, tax rates, item name, product description, images.... 
4. Platforms can use GTIN/UPC for cross referencing products in their catalog and with the global catalog. 


## The Approach.
How do you go about building this open catalog that would be usable by all platforms? 

### Open community driven process. 
Create a working group that would come up with the recommendations for standardized product attributes for FMCG products. 
This working group would include: 

1. BPPs 
2. BAPs
3. Brand owners. 
4. ONDC Team
5. Beckn Core Group


**This group's responsibility would be to:**

1. Arrive at the product schema that would be used in beckn enabled networks.
1. Define the methodology for evolution of the schema. 
2. Define of the process (manual/automated) to do updates into this global catalog that would put least strain on brand owners. 
3. Get this reviewed by BPPs and BAPs on the ONDC Network. 
4. Handover the process to project management of open catalog who will ensure the smooth functioning of this system.


### Formation of the Working group
The initial group has been formed with the following members. 
1. Ravi from Beckn
2. Supriyo from ONDC
3. Venky from humbhionline,

### Seed design of the catalog 
Since Beckn Protocol already has an Item schema being  used for interactions between participants, we will evaluate 
1. how  this may be used for the open catalog system.  
2. Add any new attributes needed,  
3. Based on all attributes needed, define a xls or csv format that describes the same information in a flat structure. 
4. Brand Owners can upload full or changes in their catalog since the last update. So unless a new product is launched  it is not needed to be updated. Resending full update is only needed if there the product has been discontinued. 
5. Apis may be provided to know last gtin updated, last date/time updated etc to brand owners, which may be used by them for restartability. 
