##************************************************************************
# Copyright (c) 2013 Actuate Corporation.
# All rights reserved. This program and the accompanying materials
# are made available under the terms of the Eclipse Public License v2.0
# which accompanies this distribution, and is available at
# http://www.eclipse.org/legal/epl-2.0.html
#
# Contributors:
#  Actuate Corporation - initial API and implementation
#  
#*************************************************************************
#
MongoDBDataSourceWizardPage.message.default=Propiedades de conexi�n de fuente de datos Mongo

MongoDBDataSourceWizardPage.GroupTitle.URIElements=Elementos URI de base de datos Mongo

MongoDBDataSourceWizardPage.text.label.ServerHost=&Anfitri�n del servidor:

MongoDBDataSourceWizardPage.text.label.ServerPort=P&uerto del servidor:

MongoDBDataSourceWizardPage.text.label.DatabaseName=&Nombre de base de datos:

MongoDBDataSourceWizardPage.text.label.UserName=Nombre de u&suario:

MongoDBDataSourceWizardPage.text.label.Password=Cont&rase�a:

MongoDBDataSourceWizardPage.RadioButton.label.DatabaseURI=URI de base de datos &Mongo:

MongoDBDataSourceWizardPage.GroupTitle.SupplementalSetting=Ajustes suplementarios del &cliente

MongoDBDataSourceWizardPage.checkbox.label.SocketAlive=Mantener socket &activo

MongoDBDataSourceWizardPage.checkbox.label.RequestSession=Sesi�n de &solicitud coherente

MongoDBDataSourceWizardPage.error.MissingConnectionProperty=Falta propiedad de conexi�n necesaria

#
MongoDBDataSetWizardPage.label.DBName=Base de datos Mon&go:

MongoDBDataSetWizardPage.label.DBCollection=&Colecci�n MongoDB

MongoDBDataSetWizardPage.Button.text.IncludeSystemCollection=&Incluir colecci�n del sistema

MongoDBDataSetWizardPage.Button.Refresh=&Actualizar

MongoDBDataSetWizardPage.label.DocumentNumber=N�&mero de documentos para buscar campos:

MongoDBDataSetWizardPage.group.text=&Operaci�n de comando

MongoDBDataSetWizardPage.label.OperationType=&Tipo de comando:

MongoDBDataSetWizardPage.Button.FindFields=Busca&r campos

MongoDBDataSetWizardPage.Button.text.CommandExpression=&Expresi�n...

MongoDBDataSetWizardPage.Button.tooltip.CommandExpression=Editar la expresi�n de comando.

MongoDBDataSetWizardPage.Button.QueryExpression=Expresi�n de $&consulta...

MongoDBDataSetWizardPage.Button.SortExpression=&Expresi�n de ordenaci�n...

MongoDBDataSetWizardPage.Button.AdvancedSettings=Ajustes a&vanzados...

MongoDBDataSetWizardPage.label.AvailableFields=Campos &disponibles:

MongoDBDataSetWizardPage.label.SelectedFields=Campos &seleccionados:

MongoDBDataSetWizardPage.HeaderText.SelectedFields=Nombre en pantalla del campo

MongoDBDataSetWizardPage.menuItem.remove=Eli&minar

MongoDBDataSetWizardPage.menuItem.removeAll=Quitar to&do

MongoDBDataSetWizardPage.message.default=Seleccione los campos deseados para las columnas de conjunto de datos

MongoDBDataSetWizardPage.MessageBox.title.PromptToKeepSelections=Confirmar para continuar

MongoDBDataSetWizardPage.MessageBox.message.PromptToKeepSelections=Si selecciona otra colecci�n se descartar�n los campos seleccionados actualmente.  �Desea continuar?

MongoDBDataSetWizardPage.MessageBox.title.PromptToRefreshAvailableFields=Confirmar para actualizar

MongoDBDataSetWizardPage.MessageBox.message.PromptToRefreshAvailableFields=�Desea actualizar los campos disponibles seg�n la expresi�n de comando modificada?

MongoDBDataSetWizardPage.MessageDialog.title.GeneralError=Error

MongoDBDataSetWizardPage.MessageDialog.ErrorMessage.InitPage=No es posible obtener la lista de colecciones de la fuente de datos MongoDB.

MongoDBDataSetWizardPage.ExceptionDialog.title=Error

MongoDBDataSetWizardPage.ExceptionDialog.message.FindFields=No es posible encontrar los campos disponibles.

MongoDBDataSetWizardPage.ExceptionDialog.message.NoMetaData=Ninguna conexi�n de fuente de datos activa.

MongoDBDataSetWizardPage.ExceptionDialog.message.SavaPage=Se ha producido un error al actualizar el conjunto de datos MongoDB.

MongoDBDataSetWizardPage.ExceptionDialog.message.InvalidCommandExpression=Expresi�n de comando no v�lida.

MongoDBDataSetWizardPage.ExceptionDialog.message.InvalidQueryExpression=Expresi�n de consulta no v�lida.

MongoDBDataSetWizardPage.ExceptionDialog.message.InvalidSortExpression=Expresi�n de ordenaci�n no v�lida.

MongoDBDataSetWizardPage.message.error.MissingCollectionName=El nombre de colecci�n no puede estar vac�o.

MongoDBDataSetWizardPage.message.error.InvalidDocumentNumber=Introduzca un valor entero en el n�mero de documentos para encontrar los campos

MongoDBDataSetWizardPage.message.error.SelectedFieldNotFound=El campo seleccionado "{0}" no existe.

MongoDBDataSetWizardPage.message.error.MissingCommandExpression=La expresi�n de comando no puede estar vac�a.

MongoDBDataSetWizardPage.message.error.MissingSelectedField=Se debe seleccionar al menos un campo.

MongoDBAdvancedSettingsDialog.dialogTitle=Propiedades avanzadas del tiempo de ejecuci�n del conjunto de datos

MongoDBAdvancedSettingsDialog.Label.MaxResultObjects=M�ximo de objetos de resultado en un &lote:

MongoDBAdvancedSettingsDialog.Tooltip.MaxResultObjects=El n�mero m�ximo de objetos de resultado recuperados en un lote\n por el cursor MongoDB.  Valor predeterminado = 100

MongoDBAdvancedSettingsDialog.Label.MaxDocumentsToSearch=M�ximo de documentos para buscar para &metadatos:

MongoDBAdvancedSettingsDialog.Tooltip.MaxDocumentsToSearch=El n�mero de documentos que se deben procesar para obtener los metadatos del conjunto\n de resultados de una consulta en tiempo de ejecuci�n.  Valor predeterminado = 10

MongoDBAdvancedSettingsDialog.Label.MaxDocumentsToSkip=M�ximo de documentos para o&mitir:

MongoDBAdvancedSettingsDialog.Tooltip.MaxDocumentsToSkip=Omitir los primeros n documentos en el conjunto de resultados; tipo de datos enteros.\nValor predeterminado = 0

MongoDBAdvancedSettingsDialog.Label.IndexHintExpression=Expresi�n de sugeren&cia de �ndice:

MongoDBAdvancedSettingsDialog.Tooltip.IndexHintExpression=Una de las distintas claves de �ndice que debe usar la consulta para la optimizaci�n de la misma.\n Use la sintaxis de la expresi�n de sugerencia JSON de Mongo para mostrar las claves indexadas.

MongoDBAdvancedSettingsDialog.Group.text.QueryCursorPreference=Preferencia de lectura de cursor de consultas

MongoDBAdvancedSettingsDialog.Label.QueryCursorPreference.Mode=Mo&do:

MongoDBAdvancedSettingsDialog.Tooltip.QueryCursorPreference.Mode=El modo de preferencia de lectura de una operaci�n de cursor de consultas.

MongoDBAdvancedSettingsDialog.Label.QueryCursorPreference.TagSet=Co&njuntos de etiquetas:

MongoDBAdvancedSettingsDialog.Tooltip.QueryCursorPreference.TagSet=Conjuntos de etiquetas necesarias configuradas para un nodo miembro.\n  Los conjuntos de etiquetas alternativos deben especificarse como documentos en una matriz.

MongoDBAdvancedSettingsDialog.Button.text.NoCursorTimeOut=&Sin l�mite de tiempo de cursor

MongoDBAdvancedSettingsDialog.Button.tooltip.NoCursorTimeOut=Normalmente, el servidor alcanza el l�mite de tiempo despu�s de un periodo de inactividad (10 minutos) para evitar el uso excesivo de la memoria.\n Esto se puede evitar al activar esta opci�n.

MongoDBAdvancedSettingsDialog.Button.text.AllowPartialResults=Permite resultados &parciales

MongoDBAdvancedSettingsDialog.Button.tooltip.AllowPartialResults=Cuando se utiliza con la fragmentaci�n (mongos), se pueden obtener resultados parciales a partir de un sistema fragmentado cuando existan\n fragmentos que dependan/falten en el cl�ster.  En caso contrario, el servidor de mongos devolver� un error.

MongoDBAdvancedSettingsDialog.Button.text.FlattenNestedDocuments=&Contraer colecciones anidadas

MongoDBAdvancedSettingsDialog.Button.tooltip.FlattenNestedDocuments=Una opci�n de usuario para contraer una colecci�n de campos anidada en varias filas de conjunto de datos.

MongoDBAdvancedSettingsDialog.error.NotNumberFormat.MaxResultObjects=Requiere un valor entero para "m�ximo de objetos de resultado".

MongoDBAdvancedSettingsDialog.error.NotNumberFormat.MaxDocumentsToSearch=Requiere un valor entero para "m�ximo de objetos para buscar".

MongoDBAdvancedSettingsDialog.error.NotNumberFormat.MaxDocumentsToSkip=Requiere un valor entero para "m�ximo de objetos para omitir".

MongoDBAdvancedSettingsDialog.MessageDialog.synchronizeSearchLimit.title=Restablecer ajustes de dise�o

MongoDBAdvancedSettingsDialog.MessageDialog.synchronizeSearchLimit.button=Aceptar

MongoDBAdvancedSettingsDialog.MessageDialog.synchronizeSearchLimit.message=El valor de tiempo de dise�o de "N�mero de documentos para buscar campos" se ha restablecido para que coincida con el valor de propiedad de tiepo de ejecuci�n "M�ximo de documentos para buscar metadatos".

MongoDBExpressionBuilder.dialogTitle.default=Compilador de expresiones

MongoDBExpressionBuilder.ExprssionText.label=Texto de la e&xpresi�n:

MongoDBExpressionBuilder.Button.import=I&mportar...

MongoDBExpressionBuilder.Button.tooltip.import=Importar texto de la expresi�n de un archivo local

MongoDBExpressionBuilder.Button.export=&Exportar...

MongoDBExpressionBuilder.Button.tooltip.export=Exportar el texto de la expresi�n a un archivo local

MongoDBExpressionBuilder.Button.ValidateSyntax=&Validar sintaxis

MongoDBExpressionBuilder.Button.tooltip.ValidateSyntax=Validar la sintaxis del texto de la expresi�n.

MongoDBExpressionBuilder.InfoDialog.title.validateSyntax=Validaci�n de texto de expresi�n

MongoDBExpressionBuilder.Expression.DialogMessage.ValidateSyntax.IsValid=Sintaxis de expresi�n v�lida.

MongoDBExpressionBuilder.Expression.DialogMessage.ValidateSyntax.Invalid=Sintaxis de expresi�n no v�lida.

MongoDBExpressionBuilder.CommandExpression.DialogTitle=Compilador de expresi�n de comando

MongoDBExpressionBuilder.CommandExpression.error.EmptyExpression=El texto de expresi�n no puede estar vac�o.

MongoDBExpressionBuilder.QueryExpression.DialogTitle=Compilador de expresi�n de consulta

MongoDBExpressionBuilder.SortExpression.DialogTitle=Compilador de expresi�n de ordenaci�n





