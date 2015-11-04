// including suds.js file
Titanium.include('suds.js');
var window = Titanium.UI.createWindow({
	backgroundColor : '#ffffff',
	exitOnClose : true,

});

var table = Ti.UI.createTableView();
var tableData = [];
var row;
var url = "http://www.webservicex.net/CurrencyConvertor.asmx?wsdl";
var callparams = {
	FromCurrency : 'GBP',
	ToCurrency : 'INR'
};

var suds = new SudsClient({
	endpoint : url,
	targetNamespace : 'http://www.webserviceX.NET/'
});

try {
	suds.invoke('ConversionRate', callparams, function(xmlDoc) {
		var results = xmlDoc.documentElement.getElementsByTagName('ConversionRateResult');
		Ti.API.info('results: ' + results);
		if (results && results.length > 0) {
			var result = results.item(0);
			Ti.API.info('result: ' + result);
			var data = '';
			data += '1 BGP is equal ' + results.item(0).textContent + ' INR';
			Ti.API.info('data: ' + data);

			row = Ti.UI.createTableViewRow({
				height : '40dp'

			});

			var label = Ti.UI.createLabel({
				top : 10,
				left : 10,
				width : 'auto',
				height : 'auto',
				color : '#e84940',
				text : data,
			});
			Ti.API.info('label: ' + label);

			//label.textContent = '1 Euro buys you ' + results.item(0).textContent + ' U.S. Dollars.';

			//Ti.API.info('1 BGP is equal '+results.item(0).textContent+ ' INR');
			//Ti.API.info('labal value is'+label);
		} else {
			label.textContent = 'Oops, could not determine result of SOAP call.';
		}
		//window.add(label);

		row.add(label);
		tableData.push(row);
		table.setData(tableData);
		window.add(table);
		window.open();
	});
} catch(e) {
	Ti.API.error('Error: ' + e);
}