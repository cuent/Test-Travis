<?php
/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Created by IntelliJ IDEA.
 * User: sschaffe
 * Date: 27.01.12
 * Time: 14:13
 * To change this template use File | Settings | File Templates.
 */

require_once 'autoload.php';

use MarmottaClient\ClientConfiguration;
use MarmottaClient\Clients\ImportClient;
use MarmottaClient\Clients\ResourceClient;

$config = new ClientConfiguration("http://localhost:8080/mtta");

$client = new ImportClient($config);

// list supported types
echo "Supported Types: ";
foreach($client->getSupportedTypes() as $type) {
    echo $type . ",";
}
echo "\n";


// import a simple data set
$data = "<http://example.com/resource/r1> <http://example.com/resource/p1> \"Test Data\".";
$client->uploadDataset($data,"text/rdf+n3");


// wait a bit for import to finish
sleep(1);


$rclient = new ResourceClient($config);

foreach($rclient->getResourceMetadata("http://example.com/resource/r1") as $property => $value) {
    echo $property . " = " . $value[0] . "\n";
}




?>