require.config({
	paths: {
		'domReady': 'thirdparty/requirejs/domReady',
		'jquery': 'thirdparty/jquery/jquery-2.1.1',
		'bootstrapValidator': 'thirdparty/bootstrapValid/bootstrapValidator',
		'zh_CN': 'thirdparty/bootstrapValid/zh_CN',
		'jquery.simplePagination' : 'thirdparty/simplePg/jquery.simplePagination',
		'bootstrap-treeview': 'thirdparty/treeview/bootstrap-treeview',
	},
	shim: {
		'jquery.ui' : {
			deps : ['jquery']
		},
		'jquery.qtip': {
			deps: ['jquery']
		},
		'jquery.form': {
			deps: ['jquery']
		},
		'jquery.validate': {
			deps: ['jquery']
		},
		'jquery.jqgrid' : {
			deps: ['jquery', 'jquery.ui']
		},
		'jquery.jqgrid.locale' : {
			deps: [ 'jquery.jqgrid' ]
		},
		'jquery.select2': {
			deps: ['jquery']
		},
		'jquery.select2.locale': {
			deps: ['jquery.select2']
		},
		'jquery.ztree' : {
			deps : ['jquery']
		},
		'underscore': {
			exports : '_'
		},
		'underscore.string': {
			deps : ['underscore']
		},
		'kindeditor': {
			exports: 'KindEditor'
		},
		'kindeditor.locale': {
			deps: ['kindeditor']
		},
		'masonry': {
			exports: 'Masonry'
		}
	}
});