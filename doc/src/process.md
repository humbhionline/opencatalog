# Process (Tentative to be reviewed)
## For Brand Owner
1. Self register to open_catalog website (e.g some thing like opencatalog.ondc.org ) with a domain email (e.g opencatalog.ondc@[brand domain]) 
1. The email would be verified with a secret code sent to the email. 
1. ONDC Support would onboard the company/domain (KYB/KYC Etc as needed)
1. For manual updates, After KYC/KYB process, Owner can login; 
	1. Goto the Item list from the catalog menu and search/modify existing items or add new items with images. 
	1. It is also possible to upload bulk data via xls, a format in alignment with the Item schema. 

3. An ApiKey would be generated for the brand owner(a user) who wish to update catalog via api integration e.g

	
	1. For individual updates
	
	|Comand|
	|-|
	|curl -L -H 'ApiKey:a499a4c98fc27a40b996f4d3287eb4e4a38c56d0' -H 'Content-Type:application/json' -H 'Accept:application/json' "https://opencatalog.ondc.org/items/save" -d '{ ...item json as defined in schema... 	}'|
	1. For bulk updates 
	
	|Command|
	|-|
	|curl -L -H 'ApiKey:a499a4c98fc27a40b996f4d3287eb4e4a38c56d0' -H 'Accept:application/json' -F  datafile=@src/main/resources/Item.xlsx 		"https://opencatalog.ondc.org/items/importxls"|
	
## For an ONDC participant (BPP/BAP)
1. Auto  registered into open catalog with the participant id. 
2. Using a Signed Request, one can request for 
	1. "/items/search/[keyword|item_name..]"
	2. "/items/exportxls" To export the entire catalog

3. The Catalog could call an api like "/on_catalog_update" on the participant's end point to propagate the catalog changes. 