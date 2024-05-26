# Task_1

mkdir farm  
cd ~/farm  
cat > home_animals  
cat > pack_animals  
cat home_animals pack_animals > animals  
cat animals  
mv animals human_friends  
ls -ali

# Task_2

cd ..  
mkdir Farm_system  
cd ~/farm  
mv human_friends ~/Farm_system  
ls -ali  
cd..  
cd ..  

# Task_3

sudo wget https://dev.mysql.com/get/mysql-apt-config_0.8.23-1_all.deb  
sudo dpkg -i mysql-apt-config_0.8.23-1_all.deb  
sudo apt-get update  
sudo apt-get install mysql-server  

# Task_4

sudo wget https://download.docker.com/linux/ubuntu/dists/jammy/pool/stable/amd64/docker-ce-cli_20.10.13~3-0~ubuntu-jammy_amd64.deb  
sudo dpkg -i docker-ce-cli_20.10.133-0ubuntu-jammy_amd64.deb  
sudo dpkg -i docker-ce-cli_20.10.13~3-0~ubuntu-jammy_amd64.deb  
sudo dpkg -r docker-ce-cli  
sudo dpkg -r docker-ce  
sudo dpkg -r docker-ce-cli