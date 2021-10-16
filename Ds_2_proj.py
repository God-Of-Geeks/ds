#!/usr/bin/env python
# coding: utf-8

# # Useful Snippets

# In[8]:


get_ipython().system(' pip install pandas')


# In[16]:


# Checking the redundancy
#ls = tr_data.groupby(['tx_hash','block_time']).size()
#temp = tr_data.loc[tr_data['tx_hash'] == '0x9696bd31ba71959b385faea58a4f9f1c712a8770f2ac4b9deda06114404f605a']


# In[ ]:


# Time Calculation

# import time
# start_time = time.time() # Before exec

# print("--- %s seconds ---" % (time.time() - start_time)) # After exec


# # Start Prog

# In[3]:


import pandas as pd
import numpy as np
import csv


# In[4]:


tr_data = pd.read_csv('/Users/srikaramara/transactions/tx_transfers_10-11-2020_etherum_tx_csv-000000000025.csv', sep=',')


# ### First Question

# In[5]:


import time
start_time = time.time()
# First Question
blk_no = tr_data.drop_duplicates(subset=['tx_hash']) # blk no is dropped duplicates dataframe
dff = blk_no.groupby(["block_number","block_time"]).gas.sum().reset_index()
dff.sort_values(by = "gas", kind='heapsort')
dff.rename(columns={'gas': 'block_gas'}, inplace=True) # dff = first q
# dff.to_csv('/Users/srikaramara/Desktop/first_q.csv')
print("--- %s seconds ---" % (time.time() - start_time))
print(dff)

# ### Second Question

# In[6]:


tmp_1 = blk_no.groupby(['block_number','block_time']).size().to_frame('transactions')
# tmp_1.to_csv('/Users/srikaramara/Desktop/second_q.csv')

print(tmp_1)
# ### Third Question

# In[ ]:
